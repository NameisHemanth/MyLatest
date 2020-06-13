package codeoptimization;
class Student
{
	public Mobile percent()
	{
		return new Mobile();
	}
}
class Mobile
{
	public Simple message()
	{
		return new Simple();
	}
}
class Simple
{
	public void demo()
	{
		System.out.println("Demo Method");
	}
}
public class Tester4
{
	public static void main(String[] args)
	{
		Student rv = new Student();
		Mobile abc = rv.percent();
		Simple xyz = abc.message();
	}
}
