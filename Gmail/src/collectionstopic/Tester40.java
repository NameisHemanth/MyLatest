package collectionstopic;
import java.util.LinkedHashMap;
public class Tester40 
{
	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put("username1", "password1");
		map.put("username2", "password2");
		map.put("username3", "password3");
		map.put("username4", "password4");
		System.out.println(map);
		
		for(Object key:map.keySet())
		{
			System.out.println(map.get(key));
		}
	}
}
