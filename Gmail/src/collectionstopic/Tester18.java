package collectionstopic;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Tester18
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
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println("=================");
		Iterator itr2 = set.iterator();
		System.out.println(itr2.next());
		System.out.println(itr2.next());
		System.out.println(itr2.next());
		System.out.println(itr2.next());
		System.out.println(itr2.next());
	}
}
