package collection;
import java.util.*;
public class ArrayListCopyDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>(1);
		ll.add("Red");
		ll.add("Blue");
		ll.add("Black");
		ll.add("Green");
		ll.add("Yellow");
		ArrayList<String> al=new ArrayList<String>(ll);
		System.out.println(al);
		//System.out.println(ll);
	}
}
