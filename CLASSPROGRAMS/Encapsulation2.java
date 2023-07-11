package CLASSPROGRAMS;
public class Encapsulation2 
{
	private int id;    
	private int marks;

	public static void main(String[] args) 
	{
		Student25 obj1=new Student25();
		obj1.display();
		Encapsulation2 obj2=new Encapsulation2(101,86);
		
		obj2.display();
		obj2.setId(102);
		obj2.setMarks(96);
		System.out.println("party");
		obj2.display();
	}

	public Encapsulation2(int id, int marks) 
	{
		super();
		this.id = id;
		this.marks = marks;
		
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getMarks() 
	{
		return marks;
	}

	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(marks);
	}
	
}
