package INHERITANCE;
class A
{
	int a;
	void display1()
	{
		System.out.println("This is A");
	}
}
class B extends A
{
	int b;
	void display2()
	{
		System.out.println("This is B");
	}
}
public class singleinheritance 
{

	public static void main(String[] args) 
	{
		B obj1=new B();
		obj1.display1();
		obj1.display2();

	}

}
