package Final_Keyword;

//class A2
//{
//	final void display()
//	{
//		//int x = 200;--->error
//	}
//}
//class B extends A2
//{
//	//void display()	//error because final method can not be overridden or can not be redefine
//	{
//		//int x = 100;--->error
//	}
//}
//
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A2 obj=new A2();
//		obj.display();
//		System.out.println();
//
//	}
//
//}

//case 2 we can overload final method
//class A2
//{
//	final void display()
//	{
//		System.out.println("Default final method");
//	}
//	final void display(int x)
//	{
//		System.out.println("parameterized final method");
//	}
//	final void display(int x,int y)
//	{
//		System.out.println("Double parameterized final method");
//	}
//}
//
//
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A2 obj=new A2();
//		obj.display();
//		obj.display(10);
//		obj.display(10,20);
//	}
//}
//output Default final method
//parameterized final method
//Double parameterized final method

//case 3
//class A2
//{
//	static final void display()
//	{
//		System.out.println("Default final method");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A2 obj=new A2();
//		obj.display();
//	}
//}
//output Default final method

//case 4
//static final class A2
//{
//	static final void display()
//	{
//		System.out.println("Default final method");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A2 obj=new A2();
//		obj.display();
//	}
//}  
//output error