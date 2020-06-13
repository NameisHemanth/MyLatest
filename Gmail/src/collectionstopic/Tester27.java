package collectionstopic;
import java.util.LinkedHashMap;

public class Tester27
{
	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put(1, "Mohan");
		map.put(2, "Bharath");
		map.put(3, "Sharath");
		map.put(4, "Vignesh");
		map.put(5, "Suma");
		map.put(6, "Mohan");
		System.out.println(map.size());
		System.out.println(map);
	}
}
