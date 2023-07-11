package Overriding;



class FirstA {
	int x;
	int y;

	FirstA() {
		System.out.println("Default of First A:- " + x + " " + y);
	}

	FirstA(int a, int b) {
		this.x = a;
		this.y = b;

		System.out.println("First A class Constructor With Class Data Members:- " + x + " " + y);
		System.out.println("First A class Constructor with constru members:- " + a + " " + b);

	}

}

class FirstB extends FirstA {
	int a;
	static int b;

	public FirstB(int a) //a=100
	{  
		this(300, 400);
		System.out.println("Default Constructor of First B:- " + a + " " + b);
		System.out.println("Default Constructor of First B:- " + this.a + " " + b);


	}

	public FirstB(int a, int b) 
	{
		super(30, 40);
	//	this();
		this.a = a;
		this.b = b;
		System.out.println("Para Constructor of First B " + a + " " + b);    // 10 20
		System.out.println("Para Constructor of First B " + this.a + " " + this.b); // 
	}

	public FirstB() 
	{
		System.out.println("Default of First B:- " + a + " " + b);
	}

	public FirstB(float a, int b) 
	{
		this();
	}
}

public class Demo2 {

	public static void main(String[] args) {
		//FirstB obj1 = new FirstB(10, 20);

		//FirstB obj2 = new FirstB(100);
		//FirstB obj = new FirstB();
		FirstB obj3 = new FirstB(10.0f, 20);

		

	}
}