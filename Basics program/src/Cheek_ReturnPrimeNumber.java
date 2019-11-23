import java.util.Scanner;
public class Cheek_ReturnPrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		boolean res=isPrime(n);
		if (res)
			System.out.println("Prime number.");
		else 
			System.out.println("Not prime number");
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
