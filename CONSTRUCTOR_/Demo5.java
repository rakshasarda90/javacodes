package CONSTRUCTOR_;
class Test
{
	int a,b;
	int marks;
	Test(int x,int y)
	{
		System.out.println("x= "+x+" and "+"y= "+y);
		a=x;
		b=y;
		
	}
	Test(Test z)
	{
		a=z.a;
		b=z.b;
	}
	void display()
	{
		System.out.println(a+" and "+b);
	}
}
public class Demo5 
{

	private Demo5()
	{
		System.out.println("This is Demo5 Constructor which is private");
	}

	public static void main(String[] args) 
	{
		Demo5 obj3=new Demo5();
		Test obj1=new Test(101,76);
		Test obj2=new Test(obj1);		//object pass as parameter
		obj1.display();
		obj2.display();
	}

}
