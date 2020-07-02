package com.Day1;

public class FindFirstSecondHighestNumber {

	public static void main(String[] args) {
		
		int a[]= {20,40,500,11,233,56};
		
		int first=0;
		int second=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				
				second=first;
				first=a[i];
				
			}
			
			else if(a[i]>second)
			{
				second=a[i];
				
			}
		}
		System.out.println(first +"---->"+second);
		
		
	}

}
