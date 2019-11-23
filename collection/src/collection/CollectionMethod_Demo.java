package collection;
import java.util.*;
public class CollectionMethod_Demo 
{
	public static void main(String[] args)
	{
		Collection<String> col=new ArrayList<String>();
		col.add("ABHINAV");
		col.add("AHISHANT");
		col.add("RAJA");
		col.add("ANIKET");
		col.add("ANMOL");
		System.out.println(col);
		ArrayList<String>al=new ArrayList<String>();
		al.add("RADHA");
		al.add("MONA");
		al.add("SHWETA");
		al.add("RADHIKA");
		al.add("SNEHA");
		System.out.println(al);
		al.clear();
		System.out.println(al);
		List<String>bigLst=new ArrayList<String>();
		bigLst.addAll(col);
		bigLst.addAll(al);
		System.out.println(bigLst);
		System.out.println("size of arraylist is "+al.size());
		System.out.println("size of list is "+bigLst.size());
		System.out.println("size of collection is "+col.size());
		System.out.println(bigLst.contains("RADHA"));
		System.out.println(bigLst.containsAll(col));
		System.out.println(col.remove("ABHINAV"));
		System.out.println(col);
		System.out.println(col.removeAll(col));
		System.out.println(col.isEmpty());
		
	}
}