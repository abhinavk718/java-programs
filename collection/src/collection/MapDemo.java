package collection;
import java.util.*;
public class MapDemo
{
	public static void main(String[] args)
	{
		Map<Integer,String>csMap=new HashMap<Integer,String>();
		csMap.put(10, "ABHINAV");
		csMap.put(11, "ABHISHANT");
		csMap.put(12, "AMAN");
		csMap.put(13, "ANIKET");
		csMap.put(14, "AAMIT");
		System.out.println(csMap);
		System.out.println(csMap.keySet());
		System.out.println(csMap.containsKey(14));
		System.out.println(csMap.containsValue("ABHINAV"));
		System.out.println(csMap.get(14));
		System.out.println(csMap.values());
		System.out.println("Number of students in cs branch is "+csMap.size());
		Map<Integer,String>ecMap=new HashMap<Integer,String>();
		ecMap.put(20, "SHWETA");
		ecMap.put(21, "RAGANI");
		ecMap.put(22, "PALLAVI");
		ecMap.put(23, "NEHA");
		ecMap.put(24, "MAYURI");
		System.out.println(ecMap);
		System.out.println("Number of students in ec branch is "+ecMap.size());
		Map<Integer,String>bigMap=new HashMap<Integer,String>();
		bigMap.putAll(csMap);
		bigMap.putAll(ecMap);
		System.out.println(bigMap);
		System.out.println("Number of students in ec and cs branch is "+bigMap.size());
		bigMap.remove(14);
		System.out.println(bigMap);
		bigMap.clear();
		System.out.println(bigMap);
		System.out.println(bigMap.isEmpty());
	}
}
