//Q5: IF FIRST NUMBER IS GREATER THAN SECOND THEN PRINT ALL NUMBERS BETWWEN 
//THESE TWO IN A GAP OF 3 OTHERWISE IN A GAP OF 4?
package RAKSHA;

public class Demo4 {

	public static void main(String[] args) 
	{
		int n1=34;
		int n2=68;
		if(n1>n2)
		{
			while(n2<=n1)
			{
				System.out.println(n2);
				n2=n2+3;
			}
		}
		else
		{
			while(n1<=n2)
			{
				System.out.println(n1);
				n1=n1+4;
			}
		}
		

	}

}
