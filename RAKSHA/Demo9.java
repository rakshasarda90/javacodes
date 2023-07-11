package RAKSHA;

public class Demo9 
{

	public static void main(String[] args) 
	{
		int n1=99;
		int n2=68;
		if(n1>n2)
		{
			do
			{
				System.out.println(n2);
				n2=n2+3;
			}while(n2<=n1);
		}
		else
		{
			do
			{
				System.out.println(n1);
				n1=n1+4;
			}while(n1<=n2);
		}

	}

}
