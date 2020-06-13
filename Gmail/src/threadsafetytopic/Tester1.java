package threadsafetytopic;

public class Tester1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B(a1);
		C c1 = new C(a1);
		b1.setName("B Thread");
		c1.setName("C Thread");
		
		b1.start();
		c1.start();
	}
}
