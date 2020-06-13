package codeoptimization;
class Employee
{
	int empId;
	public void test1()
	{
		System.out.println("test1");
	}
}
public class Tester2
{
	public static void main(String[] args)
	{
		System.out.println(new Employee().empId);
		new Employee().test1();
		System.out.println(new Employee());
	}
}
