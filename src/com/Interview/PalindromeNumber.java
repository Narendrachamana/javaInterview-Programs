package com.Interview;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=1281;
		int exp=1281;
		int temp=0;
		
		while(num>0)
		{
			int n=num%10;
			temp=temp*10+n;
			num=num/10;
			
			
		}
		
		System.out.println(temp);
		
		if(temp== exp)
		{
			System.out.println("given number is palidrome");
		}
		else
		{
			System.out.println("given number is not palidrome");	
		}
		
		
	}

}
