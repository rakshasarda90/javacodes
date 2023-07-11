package RAKSHA1;

public class PerfectNo 
{

	public static void main(String[] args) 
	{
		
		int n=67;
		int t=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(t==sum)
		System.out.println("Perfect number");
		else
		System.out.println(" Not Perfect number");
		

	}

}
