import java.util.Scanner;
public class Binary_ToDecimal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number.");
		int n=sc.nextInt();	
		int res=binaryToDeci(n);
		System.out.println("Decimal conversion of "+n+" is "+res);
		sc.close();
	}
	public static int binaryToDeci(int n)
	{
		int sum=0,i=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*getPower(2,i);
			i++;
			n=n/10;
		}
		return sum;
	}
	public static int getPower(int x,int y)
	{
		int pow=1;
		while(y>0)
		{
			pow=pow*x;
			y--;
		}
		return pow;
	}
}
