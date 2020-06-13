package collectionstopic;
import java.util.HashMap;
//Insertion is not Maintained
public class Tester31
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("username1", "password");
		map.put(1, "password");
		map.put("username2", "password");
		map.put("username3", "password");
		map.put("username4", "password");
		System.out.println(map);
	}
}
