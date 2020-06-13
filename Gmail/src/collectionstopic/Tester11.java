package collectionstopic;
import java.util.List;
public class Tester11
{
	public static void main(String[] args) 
	{
		Simple driver = new Simple();
		List list = driver.findElements("a");
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
	}
}
