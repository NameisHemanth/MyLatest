package exceptionhandlingtopic;
public class Tester11
{
	public static void test1() throws ArithmeticException
	{
		double res = 10/5;
	}
	public static void test2() throws ArithmeticException
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
		catch(ArithmeticException e) 
		{
			System.out.println("Caught!!");
		}
		System.out.println("The Main Ends...");
	}
}
