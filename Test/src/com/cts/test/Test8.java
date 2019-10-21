package com.cts.test;

public class Test8 {
	public static void main(String[] args) 
	{
		int[] val=new int[2];
		int a[]=new int[2];
		int b[]= {1,2,3,4};
		
		//System.out.println(val[0]+val[1]+val[2]);
		for(int i=0;i<val.length;i++)
			System.out.println(val[i]);
		
		for(int j:b)//for-each
		{
			System.out.println(j);
		}
	}

}
