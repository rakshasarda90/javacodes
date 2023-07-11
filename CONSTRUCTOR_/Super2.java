package CONSTRUCTOR_;

class Base
{
	void display(int x)
	{
		System.out.println("This is Base "+x);
	}
}
class Derived extends Base
{
	void display()
	{
		super.display(100);
		System.out.println("This is Derived");
	}
}
public class Super2 
{

	public static void main(String[] args) 
	{
		Derived obj1=new Derived();
		obj1.display();
	}

}
