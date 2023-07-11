package RAKSHA1;

class First
{
	static int a=10;
	int b=20;
	void hello1()
	{
		a=900;
		b=800;
		System.out.println("Non static");
	}
	static void hello2()
	{
		a=600;
		//b=300;
		System.out.println("Static");
	}
}
public class Demo1 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Hello main");
		//hello1();
		//First.hello1();
		First obj1=new First();
		obj1.hello1();
		//hello2();
		First.hello2();
		
	}

}
