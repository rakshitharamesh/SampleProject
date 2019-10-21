package com.cts.test;

public class Test1 {
	
	private int i=0;
	public static void main(String args[])
	{
		System.out.println("hello world");
			int integer=0;
			short shortinteger=22;
			long longinteger=123;
			
			double doublefloat=1234.234;
			float floater=1234.2f;
			
			boolean b=true;
			char c='A';
			
			//converting string top int,float,double,short
			String a="95";
			int i=Integer.parseInt(a);
			String h="45.639";
			Float e=Float.parseFloat(h);
			String d="32132.24321";
			Double f=Double.parseDouble(d);
			
			
			String s="hello";
			String blank=" ";
			String t="world";
			String res=s+blank+t;
			System.out.println("   hello"+"    "+"world");
			
			while(integer<10)
			{
				System.out.println(integer);
				integer=integer+1;
			}
			
			//finding min,max of two int,float using math.min()
			integer=Math.min(10, 20);
			System.out.println("Min of a=10 and b=20 is "+integer);
			
			
			
			
			
			
			
			
			
	}
			
			
}
