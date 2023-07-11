package Overriding;
//case 1
//class I
//{
//	static int display()
//	{
//		System.out.println("I display");
//		return 10;
//	}
//}
//class J extends I
//{
//	static int display()
//	{
//		System.out.println("J display");
//		return 20;
//	}
//}
//public class Demo5 
//{
//	public static void main(String[] args) 
//	{
//		J obj1=new J();
//		obj1.display();
//	}
//}
//output J display

//case 2
//class I
//{
//	static int display()
//	{
//		System.out.println("I display");
//		return 10;
//	}
//}
//class J extends I
//{
//	int display()
//	{
//		System.out.println("J display");
//		return 20;
//	}
//}
//public class Demo5 
//{
//	public static void main(String[] args) 
//	{
//		J obj1=new J();
//		obj1.display();
//	}
//}
//output error overridden method is static. display of I cannot override in 
//display J

//case 3
//class I
//{
//	static int display()
//	{
//		System.out.println("I display");
//		return 10;
//	}
//}
//class J extends I
//{
//	static int display()
//	{
//		System.out.println("J display");
//		return 20;
//	}
//}
//public class Demo5 
//{
//	public static void main(String[] args) 
//	{
//		I obj1=new J();
//		obj1.display();
//	}
//}
//output I display because in static method their is no dyanamic binding

//case 4
//class I
//{
//	static int display()
//	{
//		System.out.println("I display");
//		return 10;
//	}
//}
//class J extends I
//{
//	static int display()
//	{
//		System.out.println("J display");
//		return 20;
//	}
//}
//public class Demo5 
//{
//	public static void main(String[] args) 
//	{
//		J obj1=new I();
//		obj1.display();
//	}
//}
//output error

//case 5
//class I
//{
//	int id=50;
//}
//class J extends I
//{
//	int id=70;
//}
//public class Demo5 
//{
//	public static void main(String[] args) 
//	{
//		J obj1=new J();
//		System.out.println(obj1.id);
//		
//		I obj2=new I();
//		System.out.println(obj2.id);
//		
//		I obj3=new J();
//		System.out.println(obj3.id);
//	}
//}
//output 70 50 50 in case of attributes their is no dyanamic binding