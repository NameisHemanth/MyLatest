package collectionstopic;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Tester19
{
	public static void main(String[] args)
	{
		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(10.5);
		set.add('A');
		set.add(90);
		set.add("Hi");
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(set);
		System.out.println(set.isEmpty());
	}
}
