import java.util.Scanner;
public class Count_Print_PrimeStrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		System.out.println("PrimeStrong numbers are :");
		int count=0;
		for (int i = 1; i <=n; i++) 
		{
			if(isPrime(i))
			{
				if(isStrong(i))
				{
				count++;
				System.out.print(i+" ");
				}
			}
		}
		System.out.println("\nTotal number of primeStrong number upto "+n+" is "+count);
		sc.close();
	}
	public static boolean isPrime(int x)
	{
		int i=2;
		while(i<=x/2)
		{
			if(x%i==0)
				return false;
			i++;
		}
		return true;
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

