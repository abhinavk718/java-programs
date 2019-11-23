package collection;
import java.util.*;
public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Red");
		al.add("Black");
		al.add("Blue");
		al.add("Purple");
		al.add("Green");
		System.out.println(al);
		LinkedList<String> ll=new LinkedList<String>(al);
		System.out.println(ll);
	}
}
