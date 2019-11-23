import java.util.Scanner;
public class Return_Power 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of p and q.");
		int p=sc.nextInt();
		int q=sc.nextInt();
		sc.close();
		int res=getPower(p,q);
		System.out.println("Power of "+p+" and "+q+ " is "+res);
	}
	public static int getPower(int x,int y)
	{
		int i=1,pow=1;
		while(i<=y)
		{
			pow=pow*x;
			i++;
		}
		return pow;
	}
}
