package multithreadingtopic;
public class Tester1
{
	public static void main(String[] args) 
	{
		System.out.println("The Main Starts...");
		try 
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("The Main Ends...");
	}
}
