package collectionstopic;
import java.util.ArrayList;
public class Tester35
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(10.5);
		list.add('A');
		list.add(true);
		list.add("Hi");
		System.out.println(list);
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
	}
}
