package collectionstopic;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Tester21
{
	public static void main(String[] args)
	{
		Set<String> set = new TreeSet<String>();
		set.add("Ball");
		set.add("Cat");
		set.add("Doll");
		set.add("Elephant");
		set.add("Apple");
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
//		String s=(String)itr.next();
//		System.out.println(s.toUpperCase());
		System.out.println(itr.next().toUpperCase());
		System.out.println(itr.next().toLowerCase());
	}
}
