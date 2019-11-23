import java.util.Scanner;
public class Hexa_ToDecimal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hexadecimal number.");
		String str=sc.next();
		int res=hexa_ToDecimal(str);
		System.out.println("decimal conversion of hexadecimal number "+str+" is "+res);
		sc.close();
	}
	public static int hexa_ToDecimal(String st)
	{
		int dec=0,i=0;
		int l=st.length()-1;
		while(l>=0)
		{
		   char ch=st.charAt(l);
           if(ch>='a'&&ch<='z')
               dec=dec+(ch-87)*getPower(16,i);
           else if(ch>='A'&&ch<='Z')
        	   dec=dec+(ch-55)*getPower(16,i);
           else
        	   dec=dec+(ch-48)*getPower(16,i);
		   i++;
		   l--;
		}
	    return dec;
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