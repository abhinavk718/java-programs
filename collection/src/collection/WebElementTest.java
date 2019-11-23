package collection;
import java.util.*;
public class WebElementTest 
{
	public static void main(String[] args)
	{
		ArrayList<WebElement>web=new ArrayList<WebElement>();
		WebElement w1=new WebElement("radio button");
		WebElement w2=new WebElement("chech_box");
		WebElement w3=new WebElement("button");
		WebElement w4=new WebElement("frame");
		WebElement w5=new WebElement("level");
		web.add(w1);
		web.add(w2);
		web.add(w3);
		web.add(w4);
		web.add(w5);
		//by using for loop
		for (int i = 0; i <web.size(); i++)
		{
			WebElement webele=web.get(i);
			System.out.println(webele.type);
		}
		System.out.println("----------------------------------------");
		//by using for each loop
		for (WebElement webElement : web)
		{
			System.out.println(webElement.type);
		}
		System.out.println("----------------------------------------");
		//by using iterator
		Iterator<WebElement> itr=web.iterator();
		while(itr.hasNext())
		{
			WebElement	w=itr.next();
			System.out.println(w.type);
		}
		
	}
}