package Interface;
//interface F1
//{
//	int x=100;
//	int y=200;
//	void hello();
//}
//interface F2
//{
//	void bye();
//}
//abstract class A1 implements F1,F2
//{
//	public void hello()
//	{
//		System.out.println("Its hello from f1 interface");
//	}
//}
//class B1 extends A1
//{
//	public void bye()
//	{
//		System.out.println("Its bye from f2 interface");
//	}
//}
//public class Demo2 
//{
//
//	public static void main(String[] args) 
//	{
//		B1 obj1=new B1();
//		obj1.hello();
//		obj1.bye();
//		F1 obj2=new B1();
//		obj2.hello();
//		//obj2.bye(); -->error
//		F2 obj3=new B1();
//		//obj3.hello(); -->error
//		obj3.bye();
//	}
//} 
//output hello
//bye
//hello
//bye

//case 2
//interface F1
//{
//	int x=100;
//	int y=200;
//	void hello();
//}
//interface F2
//{
//	void hello();
//}
//class A1 implements F1,F2
//{
//	public void hello()
//	{
//		System.out.println("Hello from A1");
//	}
//}
//
//public class Demo2 
//{
//
//	public static void main(String[] args) 
//	{
//		A1 obj1=new A1();
//		obj1.hello();
//		
//		F1 obj2=new A1();
//		obj2.hello();
//	
//		F2 obj3=new A1();
//		obj3.hello();
//	}
//} 
//output Hello from A1
//Hello from A1
//Hello from A1

//case 3 inheriting features one interface into another interface
//interface F1
//{
//	int x=100;
//	int y=200;
//	void hello();
//}
//interface F2 extends F1 //when same entity then use extends
//{
//	void bye();
//}
//abstract class A1 implements F2	///when same entity then use implements
//{
//	public void hello()
//	{
//		System.out.println("Hello from A1");
//	}
//}
//class B1 extends A1
//{
//	public void bye()
//	{
//		System.out.println("Bye from B1");
//	}
//}
//public class Demo2 
//{
//
//	public static void main(String[] args) 
//	{
//		B1 obj1=new B1();
//		obj1.hello();
//		obj1.bye();
//		
//	}
//} 
//output Hello from A1
//Bye from B1

//case 4 inheriting features into interface as well as class into another class
//interface F1
//{
//	int x=100;
//	int y=200;
//	void hello();
//}
//abstract class A1
//{
//	abstract public void bye();
//}
//			//implements should be used after the extends keyword
//	
//class B1 extends A1 implements F1	//why we use 1st extends and then implements
//{									//because class can inherit only one class
//	public void hello()				//but class can inherit more than one interface
//	{
//		System.out.println("Hello from A1");
//	}
//public void bye()
//	{
//		System.out.println("Hello from B1");
//	}
//}
//
//public class Demo2 
//{
//
//	public static void main(String[] args) 
//	{
//		B1 obj1=new B1();
//		obj1.hello();
//		obj1.bye();	
//	}
//}
//output Hello from A1
//Hello from B1

//case 5
//abstract class A1
//{
//	abstract public void bye();
//}
//			
//interface A1 implements F1	
//{							
//	public void hello()		
//	{
//		System.out.println("Hello from A1");
//	}
//public void bye()
//	{
//		System.out.println("Hello from B1");
//	}
//}
//
//public class Demo2 
//{
//
//	public static void main(String[] args) 
//	{
//		B1 obj1=new B1();
//		obj1.hello();
//		obj1.bye();	
//	}
//}
//output error  because interface can not bring the property of class because 
//in class their is defined methods and interface does not contain defined methods 

//case 6
//interface F1
//{
//	int x=100;
//	
//}
//interface F2  
//{
//	int x=200;
//	
//}
//class A1 implements F1,F2	
//{
//	
//}
//
//public class Demo2 
//{
//
//	public static void main(String[] args) 
//	{
////		A1 obj1=new A1();
////		System.out.println(obj1.x);		//error ambiguity
//		
//		F1 obj2=new A1();
//		System.out.println(obj2.x);		//100
//		
//		F2 obj3=new A1();
//		System.out.println(obj3.x);		//200
//	}
//} 
