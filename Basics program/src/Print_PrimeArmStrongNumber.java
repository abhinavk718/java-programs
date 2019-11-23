import java.util.Scanner;
public class Print_PrimeArmStrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i =1; i <=n; i++)
		{
			if (isPrime(i))
			{
				if(isArmStrong(i))
				{
					System.out.print(i+" ");
				}
     		}
		}
		sc.close();	
	}
	public static int digitCount(int y)
	{
		int count=0;
		while(y>0)
		{
			count++;
			y=y/10;
		}
		return count;
	}
	public static boolean isPrime(int z)
	{
		int i=2;
		while(i<=z/2)
		{
			if(z%i==0)
				return false;
			i++;
		}
		return true;
	}
	public static boolean isArmStrong(int p)
	{
		int dc=digitCount(p);
		int sum=0,t=p;
		while(p>0)
		{
			int ld=p%10;
			sum=sum+getPower(ld,dc);
			p=p/10;
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
}