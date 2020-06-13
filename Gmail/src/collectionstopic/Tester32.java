package collectionstopic;
import java.util.TreeMap;
//null is not allowed as a key, but allowed as a value
//Complete auto-sorting on Keys, So keys should be homogenous
//values can be heteorgenous
public class Tester32
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
		map.put("username4", "password1");
		map.put("username6", "password1");
//		map.put(null, "passwordOne");
		map.put("username5", null);
//		map.put(1, "passwordOne");
		map.put("username2", "password2");
		map.put("username1", "password3");
		map.put("username3", "password4");
		System.out.println(map);
	}
}
