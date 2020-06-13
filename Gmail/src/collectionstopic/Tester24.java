package collectionstopic;
import java.util.PriorityQueue;
public class Tester24
{
	public static void main(String[] args)
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add("Charles");
		queue.add("Dennis");
		queue.add("Albert");
		queue.add("Einstein");
		queue.add("Bhaskar");
		System.out.println(queue);
		int size = queue.size();
		for(int i=1;i<=size;i++)
		{
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
