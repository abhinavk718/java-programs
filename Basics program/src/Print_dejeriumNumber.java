import java.util.Scanner;
public class Print_dejeriumNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++)
		{
			if(isDejerium(i))
				System.out.print(i+" ");
		}
		sc.close();
	}
	public static boolean isDejerium(int x)
	{
		int sum=0,ld,t=x;
		int dc=countDigit(x);
		while(x>0)
		{
			ld=x%10;
			sum=sum+getPower(ld,dc);
			dc--;
			x=x/10;
		}
		if(sum==t)
		      return true;
		else
			return false;
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
	public static int countDigit(int x)
	{
		int count=0;
		while(x>0)
		{
			count++;
			x=x/10;
		}
		return count;
	}
}