package CONSTRUCTOR_;

class Test2
{
	int a, b;
	Test2(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+" and "+b);
	}
	Test2()
	{
		
	}
	Test2 sum(Test2 x)
	{
		Test2 z=new Test2();
		z.a=a+x.a;
		z.b=b+x.b;
		return z;
		
	}
	void dispaly()
	{
		System.out.println(a+" and "+b);
	}
}
public class This2 
{

	public static void main(String[] args) 
	{
		Test2 obj1=new Test2(10,20);
		Test2 obj2=new Test2(30,50);
		Test2 obj3=new Test2();
		obj3=obj1.sum(obj2);
//		obj1.dispaly();
//		obj2.dispaly();
		obj3.dispaly();
		
	}

}
