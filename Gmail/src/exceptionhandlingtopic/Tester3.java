package exceptionhandlingtopic;
//Catch block will be executed only if there is an Exception
public class Tester3
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		int a = 10;
		int b = 5;
		try
		{
			double res = a/b;
			System.out.println("The Division result is:"+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught!!");
		}
		System.out.println("The Main Ends...");
	}
}
