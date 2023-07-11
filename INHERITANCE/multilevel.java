package INHERITANCE;
class A1
{
	int a;
	void display1()
	{
		System.out.println("This is A parent of B");
	}
}
class B1 extends A1
{
	int b;
	void display2()
	{
		System.out.println("This is B child of A");
	}
	
}
class C extends B1
{
	int c;
	void set()
	{
		a=100;
		b=200;
		c=300;
	}
	void sum()
	{
		System.out.println("Sum of a+b+c is: "+(a+b+c));
	}
	void display3()
	{
		System.out.println("This is C child of B");
	}
}
public class multilevel 
{

	public static void main(String[] args) 
	{
		C obj1=new C();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.set();
		obj1.sum();

	}

}
