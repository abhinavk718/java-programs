import java.util.Scanner;
public class Print_Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i =1; i <=n; i++)
		{
			System.out.println(i+" !"+" = "+getFactorial(i)+" ");
		}
		sc.close();
	}
	public static int getFactorial(int x)
	{
		int fact=1;
		while(x>0)
		{
			fact=fact*x;
			x--;
		}
		return fact;
	}
}
