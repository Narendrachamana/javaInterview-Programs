package com.Interview;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,5,4,3,6};
		
		int n=5;
		int sum=(n+1)*(n+2)/2;
		for( int i=0;i<n;i++)
		
		{
			sum-=a[i];
		
		}
		System.out.println(sum);
		
		
	}

}
