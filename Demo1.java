package Abstract;
//case 1
//abstract class Student
//{
//	abstract void fun1();
//}
//abstract class Person extends Student
//{
//	abstract void fun2();
//}
//class Hello extends Person
//{
//	void fun1()
//	{
//		System.out.println("This is fun1 from student");
//	}
//	void fun2()
//	{
//		System.out.println("this is fun2 from person");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1(); //this is from student
//		obj.fun2(); //this is from person
//		Student obj3=new Hello();  //we can create reference of abstract class
//		obj3.fun1();
//		//obj3.fun2();
//		//Person obj2=new Person(); //error
//		//Student s=new=Student(); //error
//	}
//}

//case 2
//abstract class Student
//{
//	abstract void fun1();
//}
//class Person extends Student
//{
//	void fun1()
//	{
//		System.out.println("This is fun1 from student");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Person obj=new Person();
//		obj.fun1();
//	}
//}
//output This is fun1 from student

//case 3
//abstract class Student
//{
//	//we can have abstract class without any abstract method
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person
//{
//	void fun1()
//	{
//		System.out.println("This is Hello");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//	}
//}
//output This is Hello

//case 4
//abstract class Student
//{
//	void fun2()
//	{
//		System.out.println("This is fun 2 from student");
//	}
//	abstract void fun1();
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person
//{
//	void fun1()
//	{
//		System.out.println("This is fun 1 abstract method");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj1=new Hello();
//		obj1.fun1();
//		Student obj2=new Hello();
//		obj2.fun2();
//	}
//}
//output This is fun 1 abstract method
//	   This is fun 2 from student

//case 5
//final abstract class Student
//{
//	abstract void fun1();	
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person
//{
//	void fun1()
//	{
//		System.out.println("This is Hello from student of fun 1");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//	}
//}
//output error becoz The class Student can be either abstract or final, not both

//case 6
//abstract class Student
//{
//	Student()		//abstract Student();-->error
//	{				//we cannot use abstract keyword with constructor
//		System.out.println("This is constructor");
//	}
//	abstract void fun1();	
////	abstract int marks;-->error we cannot use abstract keyword with attributes
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person
//{
//	void fun1()
//	{
//		System.out.println("This is Hello from student of fun 1");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//		
//	}
//}
//output This is constructor
//This is Hello from student of fun 1

//case 7
//abstract class Student
//{	
//	abstract void fun1();
//	abstract void fun2()	//error we cannot use abstract keyword with defined method
//	{
//		System.out.println("This is fun 2");
//	}
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person
//{
//	void fun1()
//	{
//		System.out.println("This is Hello from student of fun 1");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//		
//	}
//}
//output error we cannot use abstract keyword with defined method

//case 8
//abstract class Student
//{	
//	abstract public void fun1();	//abstract int fun1(); -->error diff return type
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person
//{
//	void fun1()	//Cannot reduce the visibility of the inherited method from Student
//	{
//		System.out.println("This is Hello from student of fun 1");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//		
//	}
//}
//output error Cannot reduce the visibility of the inherited method from Student
//attempting weaker access privilleges

//case 9
//abstract class Student
//{	
//	abstract public void fun1(); //implementation is not occur here 	
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person //The type Hello must implement the inherited abstract method Student.fun1()
//{
//	void fun1(int x)	
//	{
//		System.out.println("This is Hello from student of fun 1");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//		
//	}
//}
//output error The type Hello must implement the inherited abstract method Student.fun1()

//case 10
//abstract class Student
//{	
//	static abstract void fun1();  	
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person 
//{
//	void fun1()	
//	{
//		System.out.println("This is Hello from student of fun 1");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//		
//	}
//}
//output error we cannot use static and abstract keyword together

//case 11 we can overload abstract method
//abstract class Student
//{
//	abstract void fun1();
//	abstract void fun1(int x);
//	abstract void fun1(int x, int y);
//}
//abstract class Person extends Student
//{
//	
//}
//class Hello extends Person
//{
//	void fun1()
//	{
//		System.out.println("This is Hello");
//	}
//	void fun1(int x)
//	{
//		System.out.println("This is fun1 with parameter");
//	}
//	void fun1(int x,int y)
//	{
//		System.out.println("This is fun1 with 2 parameter");
//	}
//}
//public class Demo1 
//{
//
//	public static void main(String[] args) 
//	{
//		Hello obj=new Hello();
//		obj.fun1();
//		obj.fun1(10);
//		obj.fun1(10,20);
//	}
//}
//output This is Hello
//This is fun1 with parameter
//This is fun1 with 2 parameter