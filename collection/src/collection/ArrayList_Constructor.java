package collection;
import java.util.ArrayList;
public class ArrayList_Constructor 
{
	public static void main(String[] args)
	{
		ArrayList<String>al=new ArrayList<String>(5);
		al.add("abhinav");
		al.add("abhinav");
		al.add("abhinav");
		al.add("abhinav");
		al.add("abhinav");
		System.out.println(al);
		ArrayList<String>alst=new ArrayList<String>(al);
		System.out.println(alst);
		ArrayList<String>als=new ArrayList<String>();
		als.add("abhinav");
		als.add("abhinav");
		als.add("abhinav");
		als.add("abhinav");
		als.add("abhinav");
		System.out.println(als);
	}

}
