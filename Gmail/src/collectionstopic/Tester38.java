package collectionstopic;
import java.util.TreeSet;
public class Tester38
{
	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<String>();
		set.add("Hi");
		set.add("Bye");
		set.add("Welcome");
		System.out.println(set);
		
		for(String s:set)
		{
			System.out.println(s);
		}
	}
}
