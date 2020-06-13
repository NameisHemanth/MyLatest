package exceptionhandlingtopic;
public class Tester7 
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		try
		{
			int a=10/0;
		}
		catch(Throwable e)
		{
			System.out.println("Fatal Error!!");
		}
		System.out.println("The Main Ends...");
	}
}
