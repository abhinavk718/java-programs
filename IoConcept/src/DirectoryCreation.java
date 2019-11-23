import java.io.*;
public class DirectoryCreation 
{
	public static void main(String[] args)throws Exception
	{
		File f=new File("RAJA");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
	}

}
