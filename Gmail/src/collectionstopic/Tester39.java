package collectionstopic;
import java.util.PriorityQueue;
public class Tester39
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add("Hi");
		queue.add("Bye");
		queue.add("Welcome");
		System.out.println(queue);
		for(Object obj:queue)
		{
			System.out.println(obj);
		}
		System.out.println(queue);
	}
}
