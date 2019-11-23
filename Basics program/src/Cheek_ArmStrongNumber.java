import java.util.Scanner;
public class Cheek_ArmStrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		boolean res=isArmStrong(n);
		if (res) 
            System.out.println(n+" is Armstrong number");
		else
			System.out.println(n+" is not Armstrong number");
		sc.close();	
	}
	public static boolean isArmStrong(int x)
	{
		int sum=0,t=x;
		int dc=countDigit(x);
		while(x>0)
		{
			int ld=x%10;
			sum=sum+getPower(ld,dc);
			x=x/10;
		}
		if(sum==t)
		      return true;
		else
			return false; 		
	}
	public static int countDigit(int x)
	{
		int count=0;
		while(x>0)
		{
			count++;
			x=x/10;
		}
		return count;
	}
	public static int getPower(int p,int q)
	{
		int pow=1,i=1;
		while(i<=q)
		{
			pow=pow*p;
			i++;
		}
		return pow;
	}
}