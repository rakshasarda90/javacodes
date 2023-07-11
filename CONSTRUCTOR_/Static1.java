package CONSTRUCTOR_;
class  Raksha1
{
//	Raksha1()
//	{
//		System.out.println("me hu Constructor");
//	}
//	{
//		System.out.println("me hu initialization");
//	}
	
	static
	{
		System.out.println("me hu static initialization");
	}
	static void display()
	{
		System.out.println("method");
	}
}
public class Static1 
{

	public static void main(String[] args) 
	{
		//Raksha1 obj1 =new Raksha1();
		System.out.println("kattappa");
		Raksha1.display();
		Raksha1.display();
		
	}
	static
	{
		System.out.println("bahubali");
	}
	void f1()
	{
		System.out.println("shivgami");
	}

}
