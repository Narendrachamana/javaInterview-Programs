package com.Interview;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class FoundDuplicateNumbers {

	public static void main(String[] args) {
			
		int a[]= {20,34,532,44,64,67,44,20,532};
		
		Set s=new HashSet();
		
		for(int i:a)
		{
			if(!s.add(i))
			{
				System.out.println(i);
			}
		}
		
		
	}

}
