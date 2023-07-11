package CONSTRUCTOR_;

class Parent
{
	Parent(int x)
	{
		System.out.println("Parent Constructor "+x);
	}
	
}
class Child extends Parent
{
	Child()
	{
		//super();	//because whenever constructor is created by default JVM create a super in constructor so we have no need to write super in default constructor  
		super(100); //but when constructor is parameterized then we have to write super at that time
		System.out.println("Child Constructor");
		
	}
}
public class Super3 
{
			
	public static void main(String[] args) 
	{
		Child obj1=new Child(); 
		
	}

}
