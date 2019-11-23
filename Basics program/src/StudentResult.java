import java.util.Scanner;
public class StudentResult
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student five subject marks.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		String res=getResult(a,b,c,d,e);
		System.out.println("Result is "+res);
		sc.close();
	}
	public static String getResult(int a,int b,int c,int d,int e)
	{
		if(a<35||b<35||c<35||d<35||e<35)
			return "fail";
		else
		{
			double per=(a+b+c+d+e)/5;
			if(per>=75)
				return "Distinction";
			else if(per>=60)
				return "First class";
			else if(per>=50)
				return "Second class";
			else
				return "Pass";	
		}
	}
}
