package CONSTRUCTOR_;

class Student1
{
	int id;
	int marks;
	Student1()		//User defined default constructor
	{
		id=101;
		marks=98;
		System.out.println("It is called User defined default constructor");
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("marks is"+marks);
	}
}
public class Demo2 
{

	public static void main(String[] args) 
	{
		Student1 obj1=new Student1(); 
		Student1 obj2=new Student1(); 
		Student1 obj3=new Student1(); 
		//obj1.display();
		//obj2.display();
		//obj3.display();

	}

}

