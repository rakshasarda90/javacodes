package Final_Keyword;

class A1
{
	static final int x;	//static final int x; we have to declare value at the time of declaration
	/*A1()
	{
		//x=200;	//because we can not initialize static final attribute in a constructor
	}*/
	static
	{
		x=200;
	}
}
public class Demo2 
{

	public static void main(String[] args) 
	{
		A1 obj=new A1();
		System.out.println(obj.x);

	}

}
