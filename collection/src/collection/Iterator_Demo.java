package collection;
import java.util.*;
public class Iterator_Demo 
{
	public static void main(String[] args)
	{
		Set<String>csSet=new HashSet<String>();
		csSet.add("Rahul");
		csSet.add("raja");
		csSet.add("abhinav");
		csSet.add("Aniket");
		csSet.add("MonIka");
		for (String str : csSet) 
		{
			System.out.println(str.toUpperCase());
		}
		System.out.println("-------------------------------");
		Iterator<String>itr=csSet.iterator();
		while(itr.hasNext())
		{
			String name=itr.next();
			System.out.println(name);
		}
	}
}
