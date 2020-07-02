package com.Day1;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateString {

	public static void main(String[] args) {
		
		String a[]= {"abc","def","hjk","abc","hjk"};
		
		
		Set obj=new HashSet();
		
		for(String i:a)
		{
			if(!obj.add(i))
			{
				System.out.println("duplicate elements is:"+i);
			}
		}
		
		
		
		
	}

}
