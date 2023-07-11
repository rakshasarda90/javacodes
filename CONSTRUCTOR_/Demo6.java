package CONSTRUCTOR_;

class Raksha
{
	static int count;
	Raksha()
	{
		
	}
	Raksha(int x)
	{
		
	}
	Raksha(int x, int y)
	{
		
	}
	
	//Instance initialization block
	{
		count++;
	}
	void display()
	{
		System.out.println("count is "+count);
	}
}
public class Demo6 
{

	public static void main(String[] args) 
	{
		Raksha obj1=new Raksha();
		Raksha obj2=new Raksha();
		Raksha obj3=new Raksha(10);
		Raksha obj4=new Raksha(10,20);
		obj3.display();

	}

}
