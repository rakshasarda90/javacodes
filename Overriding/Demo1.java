package Overriding;


class A1
{
		int id=50;
		
}
class B1 extends A1
{
	//This instance method cannot override the static method from A
		int id=70;
		
	
}
public class Demo1 
{

	public static void main(String[] args) 
	{
		B1 obj1=new B1();
		System.out.println(obj1.id);

		A1 obj2=new A1();
		System.out.println(obj2.id);
		
		A1 obj3=new B1();
		System.out.println(obj3.id);

	}

}
