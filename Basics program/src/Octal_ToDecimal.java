import java.util.Scanner;
public class Octal_ToDecimal
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal number.");
		int n=sc.nextInt();
		int res=octalTo_Decimal(n);
		System.out.println("Decimal conversion of octal number "+n+" is "+res);
		sc.close();
	}
	public static int octalTo_Decimal(int n)
	{
		int i=0,sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*getPower(8,i);
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