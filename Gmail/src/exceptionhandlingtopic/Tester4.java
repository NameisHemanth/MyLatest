package exceptionhandlingtopic;
//case 1:: Improper exception handling = YES
//case 2:: Proper exception handling = YES
//case 3:: No exception = YES
//Real-Time :: Database closing, File Closing, Scanner close
public class Tester4
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		String s1 = "Hello";
		try
		{
			System.out.println(s1.toUpperCase());
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught!!");
		}
		finally//Will be executed in all cases
		{
			System.out.println("finally block execution");
		}
		System.out.println("The Main Ends...");
	}
}
