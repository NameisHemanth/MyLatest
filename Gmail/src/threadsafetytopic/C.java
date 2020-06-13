package threadsafetytopic;
public class C extends Thread
{
	A a1;
	public C(A a1) 
	{
		this.a1=a1;
	}
	@Override
	public void run() 
	{
		a1.tranfer();
	}
}
