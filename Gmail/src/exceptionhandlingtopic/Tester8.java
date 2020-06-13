package exceptionhandlingtopic;
public class Tester8 
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		try
		{
			int a=Integer.parseInt("Hey");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught 1");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught 2");
		}
		catch(RuntimeException e)
		{
			System.out.println("Caught 3");
		}
		catch(Exception e)
		{
			System.out.println("Caught 4");
		}
		catch(Throwable e)
		{
			System.out.println("Caught 5");
		}
		System.out.println("The Main Ends...");
	}
}
