package multithreadingtopic;
class A extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("A::"+i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
class B extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("B:"+i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class Tester3
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		a1.start();
		b1.start();
	}
}
