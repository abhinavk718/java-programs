import java.util.Scanner;
public class REturnPlaindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		boolean res=isPlaindrome(n);
		if (res)
			System.out.println("Plaindrome");
		else
			System.out.println("not Plaindrome");
		sc.close();
	}
	public static boolean isPlaindrome(int x)
	{
		int sum=0,t=x;
		while(x>0)
		{
			int r=x%10;
			sum=sum*10+r;
			x=x/10;
		}
		if (t==sum) 
		    return true;
		else
			return false;	
		}
	}
