package CLASSPROGRAMS;

import java.io.*;

import java.util.*;

class Person
{
	int id;
	String name;
	Person(int id, String name)		//int i, String n
	{
		this.id=id;					//id=i;
		this.name=name;				//name=n;
	}
	Person()
	{
		
	}
	public String toString()
	{
		return id+":"+name;
	}
}
public class Demo112 
{

	public static void main(String[] args) 
	{
		Person p1=new Person(101,"raksha");
		Person p2=new Person(102,"eshuu");
		Person p3=new Person(102,"eshuu");
		//ArrayList<Person> obj1=new ArrayList<Person>();
		HashSet<Person> obj1=new HashSet<Person>();
		obj1.add(p1);
		obj1.add(p2);
		obj1.add(p3);
		System.out.println(obj1);
		
		System.out.println(obj1 instanceof Cloneable);
		System.out.println(obj1 instanceof Serializable);
		System.out.println(obj1 instanceof RandomAccess);
		
		
	}

}
