package CONSTRUCTOR_;

class Test1
{
	int a,b;
	Test1(int a,int b)
	{
		this.a=a;		//error The assignment to variable a has no effect
		this.b=b;		//error
		System.out.println(a+" and "+b);
		a=98;
		b=97;
		this.a=122;
		this.b=222;
		System.out.println(a+" and "+b);
		System.out.println(this.a+" and "+this.b);
		System.out.println(a+" and "+b);
		a=67;
		b=34;
		System.out.println(a+" and "+b);
		System.out.println(this.a+" and "+this.b);
		
	}
	void display()
	{
		//System.out.println(a+" and "+b);
	}
}
public class This1 
{
	public static void main(String args[])
	{
		Test1 obj1=new Test1(101,76);
		obj1.display();
		
	}
}
