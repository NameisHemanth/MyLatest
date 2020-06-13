package collectionstopic;
import java.util.LinkedHashMap;
//any data type can be used for key and values
public class Tester28
{
	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put(10, 10.5);
		map.put('A', true);
		map.put("username", "password");
		map.put(null, 190);
		System.out.println(map.size());
		System.out.println(map);
	}
}
