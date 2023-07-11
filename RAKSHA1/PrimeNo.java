package RAKSHA1;

public class PrimeNo 
{

	public static void main(String[] args) 
	{
		
		int n=4;
		int i=2;
		int shivgami=0;
		while(i<n)
		{
			if(n%2==0)
			{
				shivgami=1;
				break;
			}
			i++;
		}
		if(shivgami==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println(" Not Prime number");
		}
	}
}

