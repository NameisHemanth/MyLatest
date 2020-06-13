package collectionstopic;

import java.util.ArrayList;

public class Tester4
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Calcutta");
		list.add("Delhi");
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		boolean result = list.remove("Delhi");
		System.out.println(result);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
	}
}
