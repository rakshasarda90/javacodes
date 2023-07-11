package CONSTRUCTOR_;

class Student3
{
	int id;
	int marks;
	Student3(int i, int m)
	{
		
		System.out.println("2 Parameter Constructor");
	}
	Student3()
	{
		System.out.println("Default Constructor");
	}
	Student3(int i)
	{
		System.out.println("Single Parameter Constructor");
	}
}
public class Demo4 
{

	public static void main(String[] args) 
	{
		Student3 obj1=new Student3(101,76);
		Student3 obj2=new Student3(); 
		Student3 obj3=new Student3(10);
		
	}

}
