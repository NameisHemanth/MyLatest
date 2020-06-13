package exceptionhandlingtopic;
public class Tester2
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		try
		{
			int a = Integer.parseInt("Hey");
		}
		catch(NumberFormatException rv)
		{
//			System.out.println(rv.getMessage());
			rv.printStackTrace();
		}
		System.out.println("The Main Ends...");
	}
}
