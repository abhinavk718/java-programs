import java.util.Scanner;
public class DisplayAreaREctangle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length & breadth");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		dispArea(l,b);
		sc.close();	
	}
	public static void dispArea(float x,float y)
	{
		float area=x*y;
		System.out.println("Area is "+area);
	}
}
