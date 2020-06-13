package exceptionhandlingtopic;
public class Tester6
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		
		int[] arr1 = {10,20,30,40,50,60,70};
		int[] arr2 = {10,0,30,0,50};
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			try
			{
				System.out.println(arr1[i]/arr2[i]);
			}
			catch(Throwable e)
			{
				System.out.println("Caught!!");
			}
		}
		
		System.out.println("The Main Ends...");
	}
}
