package exceptionhandlingtopic;
public class Tester1
{
	public static void main(String[] args) 
	{
		System.out.println("The Main Starts...");
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException e)//Exception Handler
		{
			System.out.println("Caught!!");
		}
		System.out.println("The Main Ends...");
	}
}
