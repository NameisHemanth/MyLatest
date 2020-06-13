package collectionstopic;
import java.util.HashSet;
import java.util.Iterator;
public class Tester20
{
	public static void main(String[] args)
	{
		HashSet rv = new HashSet();
		rv.add(10);
		rv.add(10.5);
		rv.add('A');
		rv.add(true);
		rv.add(null);
		
		Iterator d = rv.iterator();
		while(d.hasNext())
		{
			System.out.println(d.next());
		}
	}
}
