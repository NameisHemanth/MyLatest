package collectionstopic;
import java.util.LinkedHashMap;
//Keys should be unique
public class Tester29
{
	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put("username", "password1");
		map.put("username", "password2");
		map.put("username", "password3");
		map.put("username", "password4");
		System.out.println(map);
	}
}
