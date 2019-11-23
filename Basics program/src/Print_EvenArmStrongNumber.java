import java.util.Scanner;
public class Print_EvenArmStrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++)
		{
			if (isEven(i))
			{
				if (isArmStrong(i)) 
					System.out.print(i+" ");
			}
		}
		sc.close();
	}
	public static boolean isEven(int x)
	{
		if(x%2==0)
			return true;
		else
			return false;
	}
	public static int countDigit(int y)
	{
		int count=0;
		while(y>0)
		{
			count++;
			y=y/10;
		}
		return count;
	}
	public static int getPower(int x,int y)
	{
		int pow=1,i=1;
		while(i<=y)
		{
			pow=pow*x;
			i++;
		}
		return pow;
	}
	public static boolean isArmStrong(int x)
	{
		int sum=0,t=x;
		int dc=countDigit(x);
		while(x>0)
		{
			int ld=x%10;
			sum=sum+getPower(ld,dc);
			x=x/10;
		}
		if(sum==t)
			return true;
		else
			return false;
	}
}
