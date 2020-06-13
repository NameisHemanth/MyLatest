package collectionstopic;
import java.util.PriorityQueue;
public class Tester22 
{
	public static void main(String[] args)
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(50);
		queue.add(40);
		queue.add(30);
		queue.add(20);
		queue.add(10);
		System.out.println(queue.size());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println("====================");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
