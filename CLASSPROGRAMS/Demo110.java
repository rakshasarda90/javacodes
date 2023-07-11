package CLASSPROGRAMS;

//import java.io.Serializabl;
import java.util.*;


public class Demo110 
{

	public static void main(String[] args) 
	{
		/*ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj1.add(100);
		obj1.add(200);
		obj1.add(300);
		obj1.add(400);
		System.out.println(obj1);		//[100, 200, 300, 400]
		
		ArrayList<Integer> obj2=new ArrayList<Integer>();
		obj2.addAll(obj1);				
		System.out.println(obj2);		//[100, 200, 300, 400]
		
		
		
		System.out.println(obj2.isEmpty());		//false
		
		
		obj2.remove(0);
		System.out.println(obj2);		//[200, 300, 400]
		
		System.out.println(obj2.remove(0));		//200
		System.out.println(obj2);		//[300, 400]
		
		
		obj2.removeAll(obj2);
		System.out.println(obj2);		//[]
		
		System.out.println(obj1.containsAll(obj2));		//true
		System.out.println(obj2.containsAll(obj1));		//false
		
		
		obj1.isEmpty();
		System.out.println(obj1);		//[100, 200, 300, 400]
		System.out.println(obj1.isEmpty());		//false
		
		obj2.isEmpty();
		System.out.println(obj2);		//[]
		System.out.println(obj2.isEmpty());		//true
		
		obj2.removeAll(obj2);
		System.out.println(obj2);		//[]
		System.out.println(obj2.isEmpty());		//true
		
		
		obj2.size();
		System.out.println(obj2);		//[]
		System.out.println(obj2.size());	//0
		System.out.println(obj1.size());	//4
		
		obj2.addAll(obj1);				
		System.out.println(obj2);		//[100, 200, 300, 400]

		obj1.add(600);
		obj2.add(900);
		System.out.println(obj1);		//[100, 200, 300, 400, 600]
		System.out.println(obj2);		//[100, 200, 300, 400, 900]
		
		
		System.out.println(obj1.retainAll(obj2));		//true
		System.out.println(obj1);		//[100, 200, 300, 400]
		
		System.out.println(obj1);
		System.out.println(obj1.retainAll(obj2));		//false
		System.out.println(obj1);		//[100, 200, 300, 400]
		
		System.out.println(obj2);
		System.out.println(obj2.retainAll(obj1));		//true
		System.out.println(obj2);		//[100, 200, 300, 400]
		*/
		
		
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("abc");
		obj1.add("pqr");
		obj1.add("xyz");
		System.out.println(obj1);			//[abc, pqr, xyz]
		System.out.println(obj1.get(1));	//pqr
		
		System.out.println(obj1.set(2, "ijk"));		//xyz
		System.out.println(obj1);			//[abc, pqr, ijk]
		
		System.out.println(obj1.set(2, "xyz"));		//ijk
		System.out.println(obj1);			//[abc, pqr, xyz]
		
		
		obj1.indexOf(obj1);
		System.out.println(obj1.indexOf(obj1));
		System.out.println(obj1.indexOf(args));
		System.out.println(obj1.indexOf("pqr"));	//1
		
		/*LinkedList<String> obj2=new LinkedList<String>(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1 instanceof Cloneable);
		System.out.println(obj1 instanceof Serializable);
		System.out.println(obj2 instanceof RandomAccess);
		*/
	}	
}		



