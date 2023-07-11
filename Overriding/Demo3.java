package Overriding;
//case 1
class A
{
	void display()		
	{
		System.out.println("A display");
								
	}
}
class B extends A
{
	void display()
	{
		System.out.println("B display");
	}
}
public class Demo3 
{

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.display();
	}
}
//output B display

//case 2
//class A
//{
//	int display()		//int display(int x)
//	{
//		System.out.println("A display");
//		return 10;						
//	}
//}
//class B extends A
//{
//	void display()
//	{
//		System.out.println("B display");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		B obj = new B();
//		obj.display();
//	}
//}
//output- error because return type is not same and signature also different

//case 3
//class A
//{
//	void display(int x)		
//	{
//		System.out.println("A display");
//								
//	}
//}
//class B extends A
//{
//	void display()
//	{
//		System.out.println("B display");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		B obj = new B();
//		obj.display();
//	}
//}
//output - error not overriding because signature is different

//case 4
//class A
//{
//	void display()		
//	{
//		System.out.println("A display");
//								
//	}
//}
//class B extends A
//{
//	void display()
//	{
//		System.out.println("B display");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A obj = new B();
//		obj.display();
//	}
//}
//output B display

//case 5
//class A
//{
//	
//}
//class B extends A
//{
//	void display()
//	{
//		System.out.println("B display");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A obj = new B();
//		obj.display();
//	}
//}
//output error when reference of A and obj of B then on compile time static 
//bond made with A but there is nothing that's why error 

//case 5
//class A
//{
//	void display()		
//	{
//		System.out.println("A display");
//								
//	}
//}
//class B extends A
//{
//	
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A obj = new B();
//		obj.display();
//	}
//}
//output A display because at the time of child when there is nothing then parent 
//will be reponsible and parent will return

//case 6
//class A
//{
//	void display()		
//	{
//		System.out.println("A display");
//								
//	}
//}
//class B 
//{
//	void display()
//	{
//		System.out.println("B display");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		A obj = new B();
//		obj.display();
//	}
//}
//output error

//case 7
//class A
//{
//	void display()		
//	{
//		System.out.println("A display");
//								
//	}
//}
//class B extends A
//{
//	void display()
//	{
//		System.out.println("B display");
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		B obj = new A();
//		obj.display();
//	}
//}
//output error we cannot make object of parent class and don't give reference of 
//child class because child class can not hold parent class reference

//case 8
//class X
//{
//	
//}
//class Y extends X
//{
//	
//}
//class A
//{
//	X display()		
//	{
//		System.out.println("A display");
//		return null;						
//	}
//}
//class B extends A
//{
//	X display()
//	{
//		System.out.println("B display");
//		return null;
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		B obj = new B();
//		obj.display();
//	}
//}
//output B display

//case 9
//class X
//{
//	
//}
//class Y extends X
//{
//	
//}
//class A
//{
//	X display()		
//	{
//		System.out.println("A display");
//		return null;						
//	}
//}
//class B extends A
//{
//	Y display()
//	{
//		System.out.println("B display");
//		return null;
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		B obj = new B();
//		obj.display();
//	}
//}
//output B display

//case 10
//class X
//{
//	
//}
//class Y extends X
//{
//	
//}
//class A
//{
//	Y display()		
//	{
//		System.out.println("A display");
//		return null;						
//	}
//}
//class B extends A
//{
//	X display()
//	{
//		System.out.println("B display");
//		return null;
//	}
//}
//public class Demo3 
//{
//
//	public static void main(String[] args) 
//	{
//		B obj = new B();
//		obj.display();
//	}
//}
//output error because heirarachi will decrease not increase
