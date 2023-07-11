package CONSTRUCTOR_;

class A
{
	int a;
}
class B extends A
{
	int a,e;
	void set(int x,int y)
	{
		super.a=x;
		a=y;		//The primitive type int of a does not have a field y
	}
	void display()
	{
		e=super.a+a;
		System.out.println(e);
	}
}
public class Super1 
{

	public static void main(String[] args) 
	{
		B obj1=new B();
		obj1.set(100, 200);
		obj1.display();
	}

}
