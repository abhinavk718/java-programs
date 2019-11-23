import java.util.Scanner;
public class ReturnReverseNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int res=reverse(n);
		System.out.println("Reverse of "+n+" is "+res);
		sc.close();
	}
	public static int reverse(int x)
	{
		int rev=0;
		while(x>0)
		{
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		return rev;
	}
}
