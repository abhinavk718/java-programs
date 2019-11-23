import java.util.Scanner;
public class Count_Seted_Bit
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Seted bit in "+n+" is :");
		int res=countSetedBit(n);
		System.out.println(res);
		sc.close();
	}
	public static int countSetedBit(int n)
	{
		int count=0;
		while(n>0)
		{
			int r=n%2;
			if(r==1)
				count++;
			n=n/2;
		}
		return count;
	}
}
