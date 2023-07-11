package CLASSPROGRAMS;

class Student
{
	private int salary;
	private float marks;
	
	void setSalary(int s)
	{
		salary=s;
	}
	void setMarks(float m)
	{
		marks=m;
	}
	int getSalary()
	{
		return salary;
	}
	float getMarks()
	{
		return marks;
	}
	void accept(int s, float m)
	{
		salary=s;
		marks=m;
	}
	void display()
	{
		System.out.println(salary);
		System.out.println(marks);
	}
}

public class Encapsulation1 
{

	public static void main(String[] args) 
	{
		Student obj1=new Student();
		obj1.accept(20000,76);
		obj1.display();
		
		obj1.setSalary(40000);
		obj1.setMarks(88.56f);
		obj1.display();
		System.out.println(obj1.getSalary());
		
		
	}

}
