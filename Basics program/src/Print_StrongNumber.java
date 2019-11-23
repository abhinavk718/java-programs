import java.util.Scanner;
public class Print_StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) 
		{
			if(isStrong(i))
				System.out.println(i+" ");
		}
		sc.close();
	}
	public static boolean isStrong(int x)
	{
		int sum=0,t=x;
		while(x>0)
		{
			int ld=x%10;
			sum=sum+getFactorial(ld);
			x=x/10;
		}
		if(sum==t)
			return true;
		else
			return false;
	}
	public static int getFactorial(int x)
	{
		int fact=1;
		while(x>0)
		{
			fact=fact*x;
            x--;
		}
		return fact;
	}
}