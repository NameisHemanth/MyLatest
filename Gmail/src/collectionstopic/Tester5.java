package collectionstopic;
import java.util.ArrayList;
public class Tester5
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(10.5);
		list.add(true);
		list.add(90);
		System.out.println(list);
		System.out.println(list.remove(new Integer(90)));
		System.out.println(list);
	}
}

