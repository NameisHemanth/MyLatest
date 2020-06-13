package collectionstopic;
import java.util.ArrayList;
public class Tester2
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(10.5);
		System.out.println(list);
		list.add("Hi");//appending
		System.out.println(list);
		list.add(1, true);//insert the element
		System.out.println(list);
		list.set(2, 20.5);//How to change the element
		System.out.println(list);
	}
}
