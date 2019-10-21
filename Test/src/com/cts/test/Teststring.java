package com.cts.test;

public class Teststring {

	public static void main(String args[])
	{
//		char s3[]= {'A','S','T','W'}; char s4[]= {'a','s','t','w'};
//		String
//		 s3="world"; String s4="hello world"; char c1= s4.charAt(2); int i=s3.length;
//		 System.out.println("Result= "+ c1); System.out.println("Result= "+i);
//	
		
		
		// concat
		String s1="Rain";
		String s2="Drop";
		String s3="Drop Top";
		System.out.println("Concatination= "+s1.concat(s2));
		
		//System.out.println("string append = "+s1.app);
		
		//replace
//		char c1='a';
//		char c2='A';
//		String s3= replace(c1,c2);
//		System.out.println("Replace= "+ );
		
		// contains
		System.out.println("Contain result= "+s3.contains("Drop"));
		
		// substring
		System.out.println("Substring 111= "+s3.substring(1,7));
		System.out.println("Substring 2222="+s3.substring(0));
		
		//size
		String e=" hello world! today is the day  h"; 
		int l=e.length();
		System.out.println("size="+l);
		
		//split
		
		String s= "string:split:method";
		String s5[]=s.split(":",0);
		
		for(String w:s5)
		{
			System.out.println(w);
		}
		
		
		String s6[]=e.split(" ");
	
		for(String x:s6)
		{
			System.out.println(x);
		}
		
		
		//toLower && to toUpper
		String s0=s3.toLowerCase();
	System.out.println("upper case= "+s0);
	System.out.println("lower case="+s0.toUpperCase());
	
	//trim-trmis out beginning and ending spaces
	
	String p=e.trim();
	System.out.println("trimmed string="+p);
	int o=p.length();
	System.out.println("trimmed length="+o);
	
	//indexOf
	int i=e.indexOf("h",4);
	System.out.println("Index of e=" +i);
	
	System.out.println("sub stringgg "+e.substring(5,8));
	
	int j=e.indexOf(e.substring(5,8));
	System.out.println("substring index  ="+j);
	
	
	}
	
	
}