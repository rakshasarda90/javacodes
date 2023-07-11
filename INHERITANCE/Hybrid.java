package INHERITANCE;
class P
{
	int a;
	void display()
	{
		System.out.println("This is parent of child 1 and child 2");
	}
}
class Q extends P
{
	int b;
	void display1()
	{
		System.out.println("This is child 1 of parent");
	}
}
class R extends P
{
	int c;
	void display2()
	{
		System.out.println("This is child 2 of parent");
	}
}
class S extends Q 
{
	int d;
	
}
//class S extends R
//{
//	
//}
public class Hybrid 
{

	public static void main(String[] args) 
	{
		Q obj1=new Q();
		obj1.display1();
		obj1.display();
		R obj2=new R();
		obj2.display2();
		obj2.display();

	}

}
