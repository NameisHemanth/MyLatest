package threadsafetytopic;
public class A
{
	public synchronized void tranfer()
	{
		System.out.println("transfer Starts...");
		Thread t = Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			System.out.println(t.getName()+"::"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("transfer Ends...");
	}
}
