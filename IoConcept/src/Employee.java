import java.io.*;
public class Employee implements Serializable
{
	public String name;
	public int id;
	public  transient int salary;
}
