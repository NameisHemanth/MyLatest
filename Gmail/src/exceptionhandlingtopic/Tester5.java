package exceptionhandlingtopic;
//one try block can be followed with multiple catch block
public class Tester5
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		int[] arr = new int[2];
		try
		{
			System.out.println(arr[9]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught1");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught2");
		}
		finally
		{
			System.out.println("Finally Block Execution");
		}
		System.out.println("The Main Ends...");
	}
}
