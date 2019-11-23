import java.util.Scanner;
public class Cheek_StrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		boolean res=isStrong(n);
		if (res)
		    System.out.println(n+" is Strong number.");
		else 
			System.out.println(n+" is not Strong number.");
		sc.close();
	}
	public static boolean isStrong(int x)
	{
		   int sum=0,t=x;
		   while(x>0)
		   {
		        int ld=x%10;
		        int fn=getFactorial(ld);
		        x=x/10;
		         sum=sum+fn;
		   }  
		   if(sum==t)
		      return true;
		   else 
			  return false;		
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