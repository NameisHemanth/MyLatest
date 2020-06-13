package threadsafetytopic;
public class B extends Thread
{
	A a1;
	public B(A a1) 
	{
		this.a1=a1;
	}
	@Override
	public void run() 
	{
		a1.tranfer();
	}
}
