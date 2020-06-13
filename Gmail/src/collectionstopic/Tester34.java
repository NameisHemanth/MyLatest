package collectionstopic;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
//Keys should be unique
public class Tester34
{
	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put("username1", "password1");
		map.put("username2", "password2");
		map.put("username3", "password3");
		map.put("username4", "password4");
		System.out.println(map);
		System.out.println(map.get("username1"));
		System.out.println("Keys:::"+map.keySet());
		Set set=map.keySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(map.get(itr.next()));
		}
	}
}
