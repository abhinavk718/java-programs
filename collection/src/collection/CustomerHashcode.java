package collection;
public class CustomerHashcode
{
	String name;
	public CustomerHashcode(String name)
	{
		this.name=name;
	}
	public static void main(String[] args)
	{
		CustomerHashcode ch=new CustomerHashcode("abhinav");
		int rch=ch.hashCode(); 
		System.out.println(rch+"  "+ch);
		CustomerHashcode ch1=new CustomerHashcode("RAJA");
		int rch1=ch1.hashCode();
		System.out.println(rch1+"  "+ch1);
	}
}
