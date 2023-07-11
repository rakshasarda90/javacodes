package Overriding;
//case 1
//class P
//{
//	public int display()
//	{
//		System.out.println("P display");
//		return 10; 
//	}
//}
//class Q extends P
//{
//	int display()
//	{
//		System.out.println("Q display");
//		return 20;
//	}
//}
//public class Demo4 
//{
//	public static void main(String[] args) 
//	{
//		Q obj=new Q();
//		obj.display();
//	}
//}
//output error attempting to assign weaker access privillegs

//case 2
//class P
//{
//	public int display()
//	{
//		System.out.println("P display");
//		return 10;
//	}
//}
//class Q extends P
//{
//	public int display()
//	{
//		System.out.println("Q display");
//		return 20;
//	}
//}
//public class Demo4 
//{
//	public static void main(String[] args) 
//	{
//		Q obj=new Q();
//		obj.display();
//	}
//}
//output Q display

//case 3
//class P
//{
//	protected int display()
//	{
//		System.out.println("P display");
//		return 10;
//	}
//}
//class Q extends P
//{
//	public int display()
//	{
//		System.out.println("Q display");
//		return 20;
//	}
//}
//public class Demo4 
//{
//	public static void main(String[] args) 
//	{
//		Q obj=new Q();
//		obj.display();
//	}
//}
//output Q display

//case 4
//class P
//{
//	protected int display()
//	{
//		System.out.println("P display");
//		return 10;
//	}
//}
//class Q extends P
//{
//	public int display()
//	{
//		System.out.println("Q display");
//		return 20;
//	}
//}
//public class Demo4 
//{
//	public static void main(String[] args) 
//	{
//		P obj=new Q();
//		obj.display();
//	}
//}
//output Q display

//case 5
//class P
//{
//	private int display()
//	{
//		System.out.println("P display");
//		return 10;
//	}
//}
//class Q extends P
//{
//	public int display()
//	{
//		System.out.println("Q display");
//		return 20;
//	}
//}
//public class Demo4 
//{
//	public static void main(String[] args) 
//	{
//		P obj=new Q();
//		obj.display();
//	}
//}
//output error because P is private

//case 6
//class P
//{
//	private int display()
//	{
//		System.out.println("P display");
//		return 10;
//	}
//}
//class Q extends P
//{
////	public int display()
////	{
////		System.out.println("Q display");
////		return 20;
////	}
//}
//public class Demo4 
//{
//	public static void main(String[] args) 
//	{
//		Q obj=new Q();
//		obj.display();
//	}
//}
//output error because private member not accessible out of the class