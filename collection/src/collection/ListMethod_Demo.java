package collection;

import java.util.*;

public class ListMethod_Demo
{
	public static void main(String[] args) 
	{
		List<String>l=new ArrayList<String>();
		l.add("abhinav");
		l.add("radha");
		l.add("kunal");
		l.add("raghav");
		l.set(2, "pritam");
		System.out.println(l);
		l.add(3,"chandan");
		System.out.println(l);
		ArrayList<String>alst=new ArrayList<String>();
		alst.add("sonika");
		alst.add("monika");
		alst.add("harsita");
		System.out.println(alst);
		alst.addAll(2, l);
		System.out.println(alst);
		System.out.println(alst.get(2));
		alst.remove("harsita");
		System.out.println(alst);
		System.out.println(alst.indexOf("raghav"));
		System.out.println(l.lastIndexOf("pritam"));
	}
}
