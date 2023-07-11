package INHERITANCE;
class Parent
{
	int a;
	void display()
	{
		System.out.println("This is parent of child 1 and child 2");
	}
}
class Child1 extends Parent
{
	int b;
	void display1()
	{
		System.out.println("This is child 1 of parent");
	}
}
class Child2 extends Parent
{
	int c;
	void display2()
	{
		System.out.println("This is child 2 of parent");
	}
}

public class Heirarchical 
{

	public static void main(String[] args) 
	{
		Child1 obj1=new Child1();
		obj1.display1();
		obj1.display();
		Child2 obj2=new Child2();
		obj2.display2();
		obj2.display();
		
	}

}
