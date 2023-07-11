package CONSTRUCTOR_;

class P
{
	P(int y)
	{
	
		System.out.println("P Parameterized");
	}
	P()
	{	
		this(300);
		System.out.println("P Default");
	}
}
class Q extends P
{
	Q()
	{
		//this(200);
		System.out.println("Q Default");
	}
	Q(int x)
	{
		System.out.println("Q Parameterized");
	}
}
public class This3 
{

	public static void main(String[] args) 
	{
		Q obj1=new Q();
	}

}
