import java.util.Scanner;
public class CalculateAreaCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius.");
		double radius=sc.nextDouble();
		calculateArea(radius);
		sc.close();
	}
	public static void calculateArea(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle is :"+area);
	}
}
