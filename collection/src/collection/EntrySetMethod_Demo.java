package collection;
import java.util.*;
import java.util.Map.Entry;
public class EntrySetMethod_Demo
{
	public static void main(String[] args)
	{
		Map<Integer,String>csMap=new HashMap<Integer,String>();
		csMap.put(10,"ABHINAV");
		csMap.put(20,"ANIKET");
		csMap.put(30,"SHWETA");
		csMap.put(40,"HIMANSHU");
		csMap.put(50,"LOVELY");
		Set<Entry<Integer,String>>eSet=csMap.entrySet();
		for (Entry<Integer, String> entry : eSet)
		{
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"="+value);
		}
	}
}
