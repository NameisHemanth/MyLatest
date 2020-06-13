package collectionstopic;
import java.util.LinkedHashSet;
public class Tester15
{
	public static void main(String[] args)
	{
		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(10.5);
		set.add('A');
		set.add(10);
		set.add(true);
		set.add("Hi");
		set.add(null);
		set.add("Hi");
		System.out.println(set.size());
		System.out.println(set);
	}
}
