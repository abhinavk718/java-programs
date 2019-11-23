import java.util.Scanner;
public class Decimal_To_Octal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number.");
		int n=sc.nextInt();
		System.out.println("Octal conversion of "+n+" is :");
		String str=deciToOctal(n);
		System.out.println(str);
		sc.close();
	}
	public static String deciToOctal(int n)
	{
		String st="";
		while(n>0)
		{
			int r=n%8;
			st=r+st;
			n=n/8;
		}
		return st;
	}
}
