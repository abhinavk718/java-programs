import java.util.Scanner;
public class ReverseNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		sc.close();
		int t=n,sum=0;
		while(n>0)
		{ 
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println("Reverse of "+t+" is "+sum);
	}
}
