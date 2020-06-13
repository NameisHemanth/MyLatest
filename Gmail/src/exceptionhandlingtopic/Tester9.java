package exceptionhandlingtopic;
public class Tester9
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		try 
		{
			Class.forName("pack1.Simple2");
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Caught!!");
		}
		System.out.println("The Main Ends...");
	}
}
