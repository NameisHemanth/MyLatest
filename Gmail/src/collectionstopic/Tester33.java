package collectionstopic;
import java.util.Hashtable;
//null is not allowed as key and also as a value
public class Tester33
{
	public static void main(String[] args) 
	{
		Hashtable map = new Hashtable();
		map.put("username4", "password1");
		map.put("username2", "password1");
		map.put("username1", "password3");
		map.put("username3", "password4");
//		map.put(null, "password5");
//		map.put(10.5, null);
		System.out.println(map);
	}
}
