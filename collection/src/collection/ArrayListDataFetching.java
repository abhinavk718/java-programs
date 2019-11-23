package collection;
import java.util.*;
public class ArrayListDataFetching
{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("BANGALURU");
		al.add("BHOPAL");
		al.add("MYSURE");
		al.add("BIHAR");
		al.add("DELHI");
		System.out.println(al.get(2));
		System.out.println(al.get(4));
		//System.out.println(al.get(9));//index out of bond exception
		/* fetching data by for loop*/
		for (int i = 0; i <al.size(); i++) 
		{
			String ele=al.get(i);
			System.out.print(ele+" ");
		}
		System.out.println();
		/* fetching data by for-each loop*/
		for(String s:al)
		{
			System.out.print(s+" ");
		}
	}
}