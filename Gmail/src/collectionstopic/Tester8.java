package collectionstopic;
import java.util.ArrayList;
public class Tester8
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(10.5);
		list.add('A');
		list.add(10);
		list.add(true);
		list.add(10);
		list.add("Hi");
		System.out.println(list.contains(10));
		System.out.println(list.contains(90));
		System.out.println("===================");
		System.out.println(list.indexOf(10.5));
		System.out.println(list.indexOf(90.5));
		System.out.println(list.lastIndexOf(10));
		System.out.println("===================");
		System.out.println(list.subList(1, 4));
	}
}
