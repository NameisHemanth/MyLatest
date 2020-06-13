package collectionstopic;
import java.util.LinkedHashSet;
public class Tester37
{
	public static void main(String[] args) 
	{
		LinkedHashSet set = new LinkedHashSet();
		set.add("Hi");
		set.add(10);
		set.add(10.5);
		System.out.println(set);
		
		for(Object obj:set)
		{
			System.out.println(obj);
		}
	}
}
