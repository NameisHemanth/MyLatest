package codeoptimization;

class Sample1
{
	enum Test {CON1, CON2,CON3};
	static public void main(String[] args) 
	{
		Test t1 = Test.CON1;
		switch(t1)
		{
			case CON1:System.out.println("hi");
		}
	}
}
//Access Modifiers
//