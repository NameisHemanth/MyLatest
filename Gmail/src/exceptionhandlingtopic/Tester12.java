package exceptionhandlingtopic;
import java.util.Scanner;
public class Tester12
{
	public static void main(String[] args)
	{
		System.out.println("The Main Starts...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 2 Numbers(1st Number > 2nd Number)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>=b)
		{
			System.out.println(a-b);
		}
		else
		{
			throw new ArithmeticException("(1st Number < 2nd Number)");
		}
		System.out.println("The Main Ends...");
	}
}
