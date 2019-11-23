import java.util.Scanner;

public class Decimal_ToHexadecimal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number.");
		int n=sc.nextInt();
		String str=decimalToHexa(n);
		System.out.println("Hexadecimal conversion of "+n+" is "+str);
		sc.close();
	}
	public static String decimalToHexa(int n)
	{
		String str="";
		while(n>0)
		{
			int r=n%16;
			if(r<10)
				str=r+str;
			else
			{
				switch(r)
				{
				case 10:
					str='A'+str;
					break;
				case 11:
					str='B'+str;
					break;
				case 12:
					str='C'+str;
					break;
				case 13:
					str='D'+str;
					break;
				case 14:
					str='E'+str;
					break;
				case 15:
					str='F'+str;
					break;
				}
			}
			n=n/16;
		}
		return str;
	}
}