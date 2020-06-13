package collectionstopic;
import java.util.ArrayList;
public class Tester36
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("bye");
		System.out.println(list);
		
		for(String s:list)
		{
			System.out.println(s.toUpperCase());
		}
	}
}
