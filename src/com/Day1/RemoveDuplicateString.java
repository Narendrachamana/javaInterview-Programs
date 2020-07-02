package com.Day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		
		
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		
		
		Set s= new TreeSet();
		for(String i:inputList)
		{
		s.add(i);
		}
		
		System.out.println(s);
		
		
		
		
		
		
		
	}

}
