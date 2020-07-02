package com.Day2;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
				
		int arr[]= {23,55,4,8,77,956};
		int l=arr.length;
		int temp;
		
		System.out.println("before Sorting array:"+ Arrays.toString(arr));
		
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}	
			}
		}
		System.out.println("after sorting array");
		
		for(int i=0;i<l-1;i++)
		{
			
			System.out.print (arr[i]+",");
		
		}
		
		
		System.out.print(arr[l-1]);
		
		
		
	}

}
