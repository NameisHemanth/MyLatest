package multithreadingtopic;
class Prime extends Thread
{
	@Override
	public void run() 
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
				System.out.println("Prime::"+num);
			}
		}
	}
}
class Even extends Thread
{
	@Override
	public void run() 
	{
		for(int i=2;i<=1000;i+=2)
		{
			System.out.println("Even::"+i);
		}
	}
}
public class Tester6 
{
	public static void main(String[] args) 
	{
		Prime p1 = new Prime();
		Even e1 = new Even();
		p1.start();
		e1.start();
	}
}
