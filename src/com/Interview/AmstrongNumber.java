package com.Interview;

public class AmstrongNumber {

	public static void main(String[] args) {
			
		
		
		int num=407;
		int exp=num;
		
		int temp=0;
		while(num>0)
		{
			int n=num%10;
			temp=temp+n*n*n;
			num=num/10;
			
		
		}
		
		if(temp==exp)
		{
			System.out.println("given number is Amstrong");
			
		}
		else {
		  System.out.println("given number is not a amstrong");
		}
		
	}

}
