package com.cts.test;

public class Test5 {
	public static void main(String[] args) 
	{
		int loop=0;
		while(loop<10)
		{	
			System.out.println("test "+loop);
			loop++;	
	
		
				if(loop==5)
				{
					loop ++;
					continue;
				}
				
		}
		
	}
}
