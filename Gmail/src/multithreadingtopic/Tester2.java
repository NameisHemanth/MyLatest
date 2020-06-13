package multithreadingtopic;

public class Tester2
{
	public static void main(String[] args) 
	{
		System.out.println("The Main Starts...");
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getId());
		
		t1.setName("Online");
		t1.setPriority(1);
//		t1.setId(1212);
//		t1.setDaemon(true);
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getId());
		
		System.out.println("The Main Ends...");
	}
}
