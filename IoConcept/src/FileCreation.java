import java.io.*;
public class FileCreation 
{
	public static void main(String[] args)throws Exception
	{
		File f=new File("abhinav.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}
}
