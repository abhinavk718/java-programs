import java.util.Scanner;
public class ReturnSimpleIntrest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of p ,r,t");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		float res=calculateSI(p,r,t);
		System.out.println("Simple intrest of "+p+" is "+res);
		System.out.println("Total amount with intrest is "+(p+res));
		sc.close();
	}
	public static float calculateSI(int x,int y,int z)
	{
		float si=(x*y*z)/100;
		return si;
		
	}

}
