package exceptionhandlingtopic;
public class Tester10
{
	public static void test1() throws ClassNotFoundException
	{
		Class.forName("pack1.Simple");
	}
	public static void test2() throws ClassNotFoundException
	{
		test1();
	}
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		try 
		{
			test2();
		}
		catch(ClassNotFoundException e) 
		{
			System.out.println("Caught!!");
		}
		System.out.println("The Main Ends...");
	}
}
