package com.Interview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int a[]= {20,48,33,56,78,20,33,57};
		
		
		Set s=new HashSet();
		
		for(int i:a)
		{
			s.add(i);
			
		}
		System.out.println(s);
		
		
		
		
	}

}
