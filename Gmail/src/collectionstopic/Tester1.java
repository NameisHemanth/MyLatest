package collectionstopic;
import java.util.ArrayList;
class A
{
	
}
public class Tester1
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		System.out.println("The Size is::"+list.size());
		list.add(10);
		list.add(10.5);
		list.add("Hey");
		list.add('A');
		list.add(true);
		list.add(10);
		list.add(null);
		list.add(new A());		
		System.out.println("The Size is::"+list.size());
		System.out.println(list);
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
	}
}
