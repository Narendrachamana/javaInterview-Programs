package com.Day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		
		int a[]= {20,30,2,10,2,10,};
		
		
		for( int i:a)
		{ 
			System.out.println(i);
		}
		
		Set s=new TreeSet<>();
		
		for(int j:a)
		{
			s.add(j);
			
		
		}
		System.out.println(s);
		
		
		
		
	}

}

