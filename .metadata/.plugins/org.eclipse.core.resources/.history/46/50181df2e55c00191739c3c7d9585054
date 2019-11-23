import java.util.*;
public class ZensarProgram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int res=sum(num);
		System.out.println(res);
		if(res>=0 && res<10)
		{
			System.out.println(res);
		}
		else
		{
			int res1=sum(res);
			 System.out.println(res1);
		}
		    sc.close();
	}
	public static int sum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		return sum;
	}
}