package CONSTRUCTOR_;

class A1
{
	{
		System.out.println("1");	//2nd print
	}
	A1(int i)
	{
		System.out.println("2");
	}
	A1()
	{
		
		System.out.println("3");	//4th print
	}
	{
		System.out.println("4");	//3rd print
	}
	static
	{
		System.out.println("5");	//1st print
	}
}
class B1 extends A1
{
	{
		System.out.println("6");	//5th print
	}
	
}


public class Static2 
{

	public static void main(String[] args) 
	{
		B1 obj1=new B1();

	}

}
