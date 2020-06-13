package collectionstopic;

import java.util.ArrayList;
import java.util.Collections;

public class Tester9 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("Einstein");
		list.add("Charles");
		list.add("Dennis");
		list.add("Albert");
		list.add("Bhaskar");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "Charles"));
		System.out.println(Collections.binarySearch(list, "Mohan"));
		
	}
}
