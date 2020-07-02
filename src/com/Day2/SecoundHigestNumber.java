package com.Day2;

public class SecoundHigestNumber {

	public static void main(String[] args) {
				
		int arr[]= {23,450,78,119,230,777};
		int firstMax=arr[0];
		int secondamx=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>firstMax)
			{
				secondamx=firstMax;
				
				firstMax=arr[i];
			}
			
			
			else if( arr[i]>secondamx)
			{
				
				secondamx=arr[i];
			}
			
			
		}
		System.out.println(secondamx);
		System.out.println(firstMax);
		
	}

}
