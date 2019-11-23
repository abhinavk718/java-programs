import java.io.*;
public class ObjectSaveDemo
{
	public static void main(String[] args) throws Exception
	{
		Employee emp=new Employee();
		emp.id=1002;
		emp.name="abhinav";
		emp.salary=50000;
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		fos.close();
		System.out.println(emp.salary);
	}
}
