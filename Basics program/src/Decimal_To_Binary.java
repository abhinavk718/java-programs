import java.util.Scanner;
public class Decimal_To_Binary
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number.");
		int n=sc.nextInt();
		System.out.println("Binary conversion of "+n+" is :");
		String str=deciToBinary(n);
		System.out.println(str);
		sc.close();
	}
	public static String deciToBinary(int x)
	{
		String st="";
		while(x>0)
		{
			int r=x%2;
			x=x/2;
			st=r+st;
		}
		return st;
	}
}
