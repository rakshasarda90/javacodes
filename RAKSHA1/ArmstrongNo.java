package RAKSHA1;

public class ArmstrongNo 
{

	public static void main(String[] args) 
	{
		int n=371;
		//int n=Integer.parseInt(args[0]);
		int t=n;
		int r;
		int sum=0;
		while(n>0)
		{
		r=n%10;
		sum=sum+r*r*r;
		n=n/10;
		}
		if(t==sum)
		System.out.println("Armstrong number");
		else
		System.out.println(" Not Armstrong number");

	}

}
