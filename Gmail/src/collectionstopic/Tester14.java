package collectionstopic;
import java.util.HashSet;
public class Tester14
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		boolean res=set.add(10);
		System.out.println(res);
		set.add(10.5);
		set.add('A');
		boolean res2 = set.add(10);
		System.out.println(res2);
		set.add(true);
		set.add("Hi");
		set.add(null);
		set.add("Hi");
		System.out.println(set.size());
		System.out.println(set);
	}
}
