package Interface;
//interface Katappa
//{
//	int x=100;
//	int y=200;		//it is by default public static final
//	void hello();	//it is by default public abstract method
//	//{
//		//error because we cannot define method inside the interface
//	//}
//}
//abstract class A implements Katappa	//error because it will by default public abstract
//{
//	
//}
//class B extends A
//{
//	public void hello()	//privillegs of access specifier
//	{
//		System.out.println("Hello katappa kya hal he");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		B obj1= new B();
//		obj1.hello();
//		Katappa obj2=new B();
//		obj2.hello();
//		//obj2.x=300;	//error
//		System.out.println(obj2.x);
//		System.out.println(Katappa.x);
//	}
//}

//case 2
//interface Katappa
//{
//	int x;		//error because x may not have been initialized
//	int y=200;		//it is by default public static final
//	void hello();	//it is by default public abstract method
//	
//}
//output error because x may not have been initialized,we have to initialize at
//the time of declaration

//case 3
//interface Katappa
//{
//	int x;		//error because x may not have been initialized
//	int y=200;		//it is by default public static final
//	void hello();	//it is by default public abstract method
//	static
//	{
//		x=100;
//	}
//}
//output error because we cannot give any body in interface

//case 4
//interface Katappa
//{
//	public static final int x=100;		
//	int y=200;		//it is by default public static final
//	public abstract void hello();	//it is by default public abstract method
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		Katappa obj1=new Katappa();	//we cannot create object of interface
//	}
//}
//output error we cannot create object of interface

//case 5
//interface Katappa
//{
//	int x=100;		
//	int y=200;		//it is by default public static final
//	public abstract void hello();	//it is by default public abstract method
//}
//class A implements Katappa
//{
//	//The type A must implement the inherited abstract method Katappa.hello()
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//	}
//}
////output error hello method is abstract and we create child of interface but we 
////cannot give body or(we cannot define method in child class that's why error

//case 6
//interface Katappa
//{
//	int x=100;		
//	int y=200;		//it is by default public static final
//	public abstract void hello();	//it is by default public abstract method
//}
//abstract class A implements Katappa
//{
//	
//}
//class B extends A
//{
//	public void hello()	//void hello()-->error because we are not giving public
//	{
//		System.out.println("Hello katappa kya hal he");
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//	}
//}

//case 7
//interface Katappa
//{
//	int x=100;		
//	int y=200;		
//	public abstract void hello();	//it is by default public abstract method
//}
//abstract class A implements Katappa
//{
//	
//}
//class B extends A
//{
//	public void hello()	
//	{
//		System.out.println("Hello katappa kya hal he");
//	}
//}
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		//A obj1= new A();-->error we cannot create object of abstract
//		B obj1=new B();
//		obj1.hello();
//		
//		Katappa obj2=new B();
//		obj2.hello();
//		System.out.println(obj2.x);
//		//obj2.x=300;-->error The final field Katappa.x cannot be assigned
//		System.out.println(Katappa.x); //because variable x is by default static 
//	}
//}
//output Hello katappa kya hal he
//Hello katappa kya hal he
//100
//100