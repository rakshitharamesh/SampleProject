package com.cts.test;

public class Test10 {

	public static void main(String[] args) 
	{
		
		String s="WoRld Ends in 2012";
		int n=s.length();
		s=s.toLowerCase();
		System.out.println("lower case= "+s);
		s=s.toUpperCase();
		System.out.println("upper case= "+s);
		
		
		String w="server recovery software";
		int a=w.indexOf("very");
		System.out.println("Index of very= "+a);
		int b=w.indexOf("e");
		System.out.println("Index of e= "+b);
		int p=w.indexOf("e",14);
		System.out.println("Index of e after 14th position="+p);
		
		
		String sub="R4G0IGdcvm";
		String h=sub.substring(3);
		System.out.println("substring= "+h);
		String i=sub.substring(7,10);//second position must be required+1
		System.out.println("substring 2= "+i);
		
		String o="hello";
		char c=o.charAt(0);
		System.out.println("chatAt index 0= "+c);
		System.out.println("chatAt index 0= "+o.charAt(4));
		
		
		String l[]= {"red","blue","green"};
		int length=l.length;
		System.out.println("length of array= "+length);
		System.out.println("last element of l= "+l[2]);
		System.out.println("first element of l= "+l[0]);
		System.out.println("middle element length= "+l[1].length());
		System.out.println("element is l= "+l[0]+l[1]+l[2]);  //str+str= concat
															//int+int=add
		
		String k="9521830793";
		boolean f=k.startsWith("95");
		if(f==true)
		{
			System.out.println("Airtel provider");

		}
		else
		{
			System.out.println("other service provider");
			
		}
		
		
		
		String g="ebay,rediff,yahoo";
		String 	 vals[]=g.split(",");
		System.out.println(vals[0]);
		System.out.println(vals[1]);
		System.out.println(vals[2]);
		System.out.println("length of vals= "+vals.length);
			
		
}
	
	}

