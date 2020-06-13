package collectionstopic;
import java.util.ArrayList;
public class Tester7 extends ArrayList
{
	public static void main(String[] args) 
	{
		Tester7 list = new Tester7();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println(list);
		list.removeRange(2, 6);
		System.out.println(list);
	}
}
