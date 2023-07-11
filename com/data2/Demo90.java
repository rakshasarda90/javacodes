package com.data2;
//import com.data1.Dac1;
//class Indore extends Dac1
//{
//	Indore()
//	{
//		//System.out.println(a); //error because it is private
//		//System.out.println(b); //error because default does not cross package
//		System.out.println(c);
//		System.out.println(d);
//	}
//}
//public class Demo90 
//{
//	public static void main(String[] args) 
//	{
//		Indore obj1=new Indore();
//		obj1.display();
//	}
//}
//output 
//Dac1 Constructor
//300
//400
//Dac1 display

//case 2
//import com.data1.CDac;
//class Indore extends CDac
//{
//	Indore()
//	{
//		//System.out.println(a); //error because it is private
//		//System.out.println(b); //error because default does not cross package
//		System.out.println(c);
//		System.out.println(d);
//	}
//}
//public class Demo90 
//{
//	public static void main(String[] args) 
//	{
//		Indore obj1=new Indore();
//		obj1.display();
//		obj1.show();
//	}
//}
//output
//Dac1 Constructor
//200
//300
//400
//300
//400
//Dac1 display
//Show method of interface in CDac class

//case 3
//import com.data1.Dac3;
//class Indore extends Dac3
//{
//	Indore()
//	{
//		//System.out.println(a); //error because it is private
//		//System.out.println(b); //error because default does not cross package
//		//System.out.println(c);
//		//System.out.println(d);
//	}
//}
//public class Demo90 
//{
//	public static void main(String[] args) 
//	{
//		Indore obj1=new Indore();
//		//obj1.display();
//		//obj1.show();
//	}
//}
//output
//Dac1 Constructor
//200
//300
//400