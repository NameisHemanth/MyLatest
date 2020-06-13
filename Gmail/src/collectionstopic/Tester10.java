package collectionstopic;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Tester10 
{
	public static void main(String[] args)
	{
		List list = new LinkedList();
		list.add("Doll");
		list.add("Ball");
		list.add("Apple");
		list.add("90");
		list.add("Cat");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
