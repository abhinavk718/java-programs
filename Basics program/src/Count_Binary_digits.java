import java.util.Scanner;
public class Count_Binary_digits
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number.");
	    int n=sc.nextInt();
	    System.out.println("Binary digits in "+n+" is :");
	    int res=countBinaryDigits(n);
	    System.out.println(res);
	    sc.close(); 
	}
	public static int countBinaryDigits(int n)
	{
		int count=0;
		while(n>0)
		{
			int r=n%10;
			if(r==0||r==1)
				count++;
			n=n/10;
		}
		return count;
	}
}
