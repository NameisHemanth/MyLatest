package multithreadingtopic;

public class Tester5
{
	public static void main(String[] args) 
	{
		for(int num=1;num<=1000;num++)
		{
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
			System.out.println(num);
		}
		}
	}
}
