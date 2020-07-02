package com.Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringDuplicateInSentance {

	public static void main(String[] args) {
		
		String s="My name is Rahul but my last name is Kumar";
		String low=s.toLowerCase();
		String temp=" ";
		
		String a[]=low.split(" ");
		
		List ls=new ArrayList();
		
		for(String i:a)
		{
			ls.add(i);
		}
		
		for(int i=0;i<ls.size();i++)
		{
			
			for(int j=i+1;j<ls.size();j++)
			{
				if(ls.get(i).equals(ls.get(j)))
				{
					ls.remove(j);
					
				}
				
				
			}
			
			
		}
		System.out.println(ls);
		
		for(Object j:ls)
		{
			 temp=temp+j.toString()+" ";
		}
		
		System.out.println(temp);
		
	}

}
