package collectionstopic;
import java.util.LinkedHashMap;
//values can be duplicated
public class Tester30
{
	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put("username1", "password");
		map.put("username2", "password");
		map.put("username3", "password");
		map.put("username4", "password");
		System.out.println(map);	
	}
}
