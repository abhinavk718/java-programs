import java.util.Scanner;
public class Count_Display_DeseriumNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int range=sc.nextInt();
		int count=0;
		System.out.println("Deserium numbers are :");
		for (int i = 1; i <=range; i++) 
		{
			if(isDeserium(i))
			{
				count++;
			    System.out.print(i+" ");
			}
		}
		System.out.println("\ntotal deserium number upto "+range+" is "+count);
		sc.close();
	}
	public static int getPower(int x,int y)
	{
		int pow=1,i=1;
		while(i<=y)
		{
			pow=pow*x;
			i++;
		}
		return pow;
	}
	public static int countDigit(int x)
	{
		int count=0;
		while(x>0)
		{
			x=x/10;
			count++;
		}
		return count;
	}
	public static boolean isDeserium(int x)
	{
		int sum=0,t=x;
		int dc=countDigit(x);
		while(x>0)
		{
			int ld=x%10;
			sum=sum+getPower(ld,dc);
			dc--;
			x=x/10;
		}
		if(sum==t)
			return true;
		else
			return false;
	}
}