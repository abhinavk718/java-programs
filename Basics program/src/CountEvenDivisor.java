import java.util.Scanner;
public class CountEvenDivisor 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		sc.close();
		int count=0,i=1;
		while(i<=n)
		{
			if(n%i==0)
			{
				if(i%2==0)
				count++;
			}
			i++;
		}
		System.out.println("Total number of even divisors are : "+count);
	}
}
