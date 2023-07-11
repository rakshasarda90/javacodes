package CONSTRUCTOR_;

class X
{
	X(int b)
	{
		System.out.println("This is Parameterized Constructor X "+b);
	}
	
}
class Y extends X
{
	Y()
	{
		super(100);
		System.out.println("This is Default Constructor Y");
		
	}
	Y(int a)
	{
		super(400);
		System.out.println("This is Parameterized Constructor Y");
	}
	
}
class Z extends Y
{
	Z()
	{
		//super(300);
		System.out.println("This is Default Constructor Z");
		
	}
	Z(int c)
	{
		super(200);
		System.out.println("This is Parameterized Constructor Y");
		
	}
}
public class Super4 
{

	public static void main(String[] args) 
	{
		Z obj1=new Z();
		Z obj2=new Z(100);
		Z obj3=new Z(200);
	}

}
