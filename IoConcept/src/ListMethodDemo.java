import java.io.*;
public class ListMethodDemo 
{
	public static void main(String[] args)throws Exception 
	{
		 int count=0;
	     File f=new File("C:\\program Files");
	     String []s=f.list();
	     for (String s1 : s) 
	     {
	    	 File f1=new File(f,s1);
	    	 if(f1.isDirectory())
	    	 count++;
			System.out.println(s1);
	     }
	     System.out.println(count+" files or directorys are present in C:\\program Files");
	}
}
