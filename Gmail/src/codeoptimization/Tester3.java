package codeoptimization;
class Sample
{
	public static String test()
	{
		return "Hello";
	}
}
public class Tester3
{
	public static void main(String[] args)
	{
		System.out.println(Sample.test().toUpperCase());
		System.out.println(Sample.test().toUpperCase().toLowerCase().substring(2).charAt(0));
	}
}
