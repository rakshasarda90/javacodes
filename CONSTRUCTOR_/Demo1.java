package CONSTRUCTOR_;

class Student
{
	int id;
	int marks;
	void accept()
	{
		id=101;
		marks=98;
		
	}
	void display()
	{
		System.out.println("id is"+id);
		System.out.println("marks is"+marks);
	}
}
public class Demo1 
{

	public static void main(String[] args) 
	{
		Student obj1=new Student();
		obj1.accept();			//if we don't call accept method then it will take default value 0 
		obj1.display();

	}

}
