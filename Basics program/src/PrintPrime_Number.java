import java.util.Scanner;

public class PrintPrime_Number 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		for (int i = 2; i <=n; i++) 
		{
			if(isPrime(i))
			System.out.print(i+" ");
		}
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
}
