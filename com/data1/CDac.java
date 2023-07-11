package com.data1;

public class CDac extends Dac1 implements Dac2
{
	public void show()
	{
		System.out.println("Show method of interface in CDac class");
	}
	public CDac()
	{
		//System.out.println(a); //error because it is private
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
