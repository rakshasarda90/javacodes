package CLASS_OBJECTS;

class First
{
	int a=100;
	static int b=200;
}
public class Demo3 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello main");
		First obj1=new First();
		First obj2=new First();
		obj1.a=200;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj2.a=400;
		System.out.println(obj2.a);
		System.out.println(obj1.a);
		
		obj1.b=500;
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		obj2.b=1000;
		System.out.println(obj2.b);
		System.out.println(obj1.b);
	}

}
