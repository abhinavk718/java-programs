package collection;
import java.util.*;
public class CityTest
{
	public static void main(String[] args) 
	{
		ArrayList<City> arlst=new ArrayList<City>();
		City c1=new City(851214,"Madhavpur1");
		City c2=new City(851215,"Madhavpur2");
		City c3=new City(851216,"Madhavpur3");
		City c4=new City(851217,"Madhavpur4");
		arlst.add(c1);
		arlst.add(c2);
		arlst.add(c3);
		arlst.add(c4);
		//by using for-loop
	    for (int i = 0; i <arlst.size(); i++)
	    {
			City c=arlst.get(i);
			System.out.println(c.pincode+"--->"+c.cityName);
		}
	    System.out.println("-------------------------------");
	    //by using for each-loop
	    for (City city: arlst) 
	    {
			System.out.println(city.pincode+"--->"+city.cityName);
		}
	    System.out.println("----------------------------------------");
	    //by using iterator
	    Iterator<City>itr=arlst.iterator();
	    while(itr.hasNext())
	    {
	    	City city1=itr.next();
	    	System.out.println(city1.cityName+"----->"+city1.pincode);
	    }
	}
}