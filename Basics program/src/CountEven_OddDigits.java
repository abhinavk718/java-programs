import java.util.Scanner;

public class CountEven_OddDigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int eCount=0,oCount=0,t=n;
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			if(r%2==0)
			   eCount++;
			else
				oCount++;
		}
		System.out.println("Even digits in "+t+" is "+eCount);		
		System.out.println("Odd digits in "+t+" is "+oCount);
		sc.close();
	}
}
