package multithreadingtopic;

public class Tester4 
{
	public static void main(String[] args) 
	{
		int num = 19;
		boolean isPrime=true;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime Number");
		}
		
	}
}
