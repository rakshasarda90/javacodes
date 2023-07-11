package String;

//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String str="Hello";
//		System.out.println(str);
//	}
//}
//output Hello

//case 2
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String str=new String("Hello");
//		System.out.println(str);
//	}
//}
//output Hello

//case 3
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		char str1[]= {'H','e','l','l','o'};
//		String str=new String(str1);
//		System.out.println(str);
//	}
//}
//output Hello

//case 4
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String str="Hello";
//		str=str+"Welcome";
//		System.out.println(str);
//	}
//}
//output HelloWelcome

//case 5
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String str;
//		String str1="Hello";
//		str=str1+"Welcome";
//		System.out.println(str1);
//		System.out.println(str);
//	}
//}
//output Hello
//HelloWelcome

//case 6
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String s1="Hello";
//		String s2="Welcome";
//		String s3=s1.concat(s2);
//		System.out.println(s3);
//		
//	}
//}	
//output HelloWelcome

//case 7
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String s1="Hello";
//		String s2="Welcome";
//		System.out.println(s1.concat(s2));
//	}
//}	
//output HelloWelcome

//case 8
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String s1="Hello  ";
//		String s2="Welcome";
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.length());
//	}
//}
//output Hello  Welcome
//7

//case 9
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String s1="Hello  ";
//		String s2="Welcome";
//		System.out.println(s1.charAt(1));
//	}
//}
//output e

//case 10
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		String s1="Hello";
//		String s2="Welcome";
//		String s3="aHello";
//		String s4="bWelcome";
//		String s5="Hello";
//		String s6="Hello";
//		String s7="Hello";
//		String s8="hello";
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s3.compareTo(s4));
//		System.out.println(s5.compareTo(s6));
//		System.out.println(s7.compareTo(s8));
//	}
//}
//output -15
//-1
//0
//-32

//case 11
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1="Hello";
//		String s2="hello";	
//		System.out.println(s1.compareToIgnoreCase(s2));
//	}
//}
//output 0

//case 12
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1="Hello";
//		String s2="hello";	
//		String s3="hello";
//		String s4="hello";
//		System.out.println(s1.equals(s2));
//		System.out.println(s3.equals(s4));
//	}
//}
//output false
//true

//case 13
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1="Hello";
//		String s2="hello";	
//		String s3="hello";
//		String s4="hello";
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s3.equalsIgnoreCase(s4));
//	}
//}
//output true
//true

//case 14
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1="Hello dosto kaise hoo";
//		String s2="Hello";	
//		String s3="Hello dosto kaise hoo";
//		String s4="hello";	
//		System.out.println(s1.startsWith(s2));
//		System.out.println(s3.startsWith(s4));
//		System.out.println(s1.startsWith("hello"));
//		System.out.println(s1.startsWith("Hello"));
//	}
//}
//output  true
//false
//false
//true

//case 15
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1="Hello dosto aaj to party";
//		String s2="party";	
//		String s3="Hello dosto aaj to party";
//		String s4="party";	
//		System.out.println(s1.endsWith(s2));
//		System.out.println(s3.endsWith(s4));
//		System.out.println(s1.endsWith("party"));
//		System.out.println(s1.endsWith("Hello"));
//	}
//}
//output true
//true
//true
//false

//case 16
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1="Hello dosto aaj to party";
//		String s2="party";	
//		String s3="Hello dosto aaj to party hai dosto";
//		System.out.println(s1.indexOf("party"));
//		System.out.println(s1.indexOf("dosto"));
//		System.out.println(s1.indexOf("Aaj"));
//		System.out.println(s1.indexOf("goa"));
//		System.out.println(s3.indexOf("dosto"));
//	}
//}
//output 19
//6
//-1 because it will not ignore the case
//-1 because goa is not available in the string
//6 it will give first index of dosto not second

//case 17
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1="Hello dosto aaj to party hai dosto";
//		System.out.println(s1.lastIndexOf("dosto"));
//	}
//}
//output 29

//case 18
//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		
//		String s1=new String("abc");
//		String s2=new String("abc");
//		String s3="abc";
//		String s4="abc";
//		System.out.println(s1==s2);
//		System.out.println(s3==s4);
//		System.out.println(s1==s3);
//				
//	}
//}
//output false
//true
//false



//public class Demo1 
//{
//	public static void main(String[] args) 
//	{
//		int a[]=new int[5];
//		int a1=new int[5];
//		
//		System.out.println("5"+"10"+"3"+"9"+1);
//	}
//}


//public class Demo1 
//{
//	
//	
//	public static void main(String[] args) 
//	{
//		int a=15;
//		int b=25;
//		if((a<b)|| (a=5)>15)
//			System.out.println(a);
//		else
//			System.out.println(b);
//	}
//}


public class Demo1 
{
	
	
	public static void main(String[] args) 
	{
		try {
		int a,b;
		b=0;
		a=5/b;
			System.out.println("A");
		}
		catch(ArithmeticException e)
		{
			System.out.println("B");
		}
		
		
	}
}


	