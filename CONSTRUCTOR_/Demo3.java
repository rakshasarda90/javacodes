package CONSTRUCTOR_;

class Student2
{
	int id;
	int marks;
	Student2(int i, int m)
	{
		id=i;
		marks=m;
		System.out.println("It is called Consructor");
		
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("marks is"+marks);
	}
}
public class Demo3 
{

	public static void main(String[] args) 
	{
		Student2 obj1=new Student2(101,76);
		Student2 obj2=new Student2(102,97); 
		Student2 obj3=new Student2(103,54);
		obj1.display();
		obj2.display();
		obj3.display();

	}

}
