import java.util.Scanner;
public class CheckEligiblity 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age.");
		int age=sc.nextInt();
		checkEligiblity(age);
		sc.close();
	}
	public static void checkEligiblity(int x)
	{
		if(x>=18)
			System.out.println("Eligible for vote");
		else
	    	System.out.println("Not Eligible for vote");
	}
}
