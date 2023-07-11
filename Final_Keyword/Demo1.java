package Final_Keyword;
//case 1 final with attribute
//class A
//{
//	final int x;		  
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//	}
//}
//output error becoz final attribute does not have default value

//case 2
//class A
//{
//	final int x=110;		  
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//		obj1.x=120;	//error we can not change the value of final
//	}
//}
//output 110

//case 3 initializtion of final attribute in constructor
//class A
//{
//	final int x;	
//	A()			//if we make constructor then we to initialize in all constructor 
//	{
//		x=110;	
//	}
//	A(int x2)
//	{
//		x=111;
//	}
//	A(int x1,int y)
//	{
//		x=112;
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//		A obj2=new A(10);
//		System.out.println(obj2.x);
//		A obj3=new A(10,20);
//		System.out.println(obj3.x);
//	}
//}
//output 110
//111
//112 

//case 4 initialization in insatnce init. block rather in constructor
//class A
//{
//	final int x;	
//	A()			//if we make constructor then we to initialize in all constructor 
//	{
//			
//	}
//	A(int x2)
//	{
//		
//	}
//	A(int x1,int y)
//	{
//		
//	}
//	
//	{
//		x=112;
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//		A obj2=new A(10);
//		System.out.println(obj2.x);
//		A obj3=new A(10,20);
//		System.out.println(obj3.x);
//	}
//}
//output 112
//112
//112

//case 5 we can create multiple instance init. block but we can initialize value in only one instance init. block
//class A
//{
//	final int x;	
//	A()			//if we make constructor then we to initialize in all constructor 
//	{
//			
//	}
//	A(int x2)
//	{
//		
//	}
//	A(int x1,int y)
//	{
//		
//	}
//	
//	{
//		x=112;
//	}
//	{
//					//x=113;-->error coz x may already have been assigned
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//		A obj2=new A(10);
//		System.out.println(obj2.x);
//		A obj3=new A(10,20);
//		System.out.println(obj3.x);
//	}
//}

//case 6
//class A
//{
//	final int x;
	//static initialization block
//	static
//	{
//		x=100;
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//	}
//}
//output error because x is non static data member that's why in static block non 
//static member is not allowed

//case 7 static final initialization
//class A
//{
//	static final int x=100;
//	//static final int x;	//error because x may not have been initialized
//}
//public class Demo1  
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//	}
//}
//output error because x may not have been initialized

//case 8 static final attribute in a constructor
//class A
//{
//	static final int x;
//	A()
//	{
//		x=100;	//error becoz we cannot initialize static final attribute in constructor
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//	}
//}

//case 9
//class A
//{
//	static final int x;	
//	
//	//instance initialization block
//	//we cannot initialize static final attribute in instance initialization block
//	{	
//		x=100;	
//	}
//}
//public class Demo1  
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//	}
//}
//output error

//case 10
//class A
//{	
//	//static initialization block
//	//we can initialize static final attribute in static intialization block
//	static final int x;
//	static
//	{
//		x=100;	//100
//	}
//}
//public class Demo1  
//{
//	public static void main(String[] args) 
//	{
//		A obj1=new A();
//		System.out.println(obj1.x);
//	}
//}
//output 100


