package collectionstopic;

public class Sample
{
	public static void remove(int a)
	{
		System.out.println("integer version");
	}
	public static void remove(Object obj)
	{
		System.out.println("Object version");
	}
	public static void main(String[] args) 
	{
		remove(new Integer(90));
	}
}
