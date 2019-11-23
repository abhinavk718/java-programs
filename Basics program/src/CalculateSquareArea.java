import java.util.Scanner;
public class CalculateSquareArea 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of square.");
		double side=sc.nextDouble();
		calculateArea(side);
		sc.close();
	}
	public static void calculateArea(double d)
	{
		double area=d*d;
		System.out.println("Area of square is "+area);
	}
}
