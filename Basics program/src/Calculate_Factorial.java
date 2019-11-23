import java.util.Scanner;
public class Calculate_Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int res=getFactorial(n);
		System.out.println("Factorial of "+n+" is "+res);
		sc.close();	
	}
	public static int getFactorial(int x)
	{
		int i=1,fact=1,t=x;
		while(i<=t)
		{
			fact=fact*x;
			i++;
			x--;
		}
		return fact;
	}
}
