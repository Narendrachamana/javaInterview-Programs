package com.Day1;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		
		int temp=0;
		
		while(num>0)
		{
			
			int n=num%10;
			temp=temp+n*n*n;
			num=num/10;
			}
		
		System.out.println(temp);
		
		
	}

}
