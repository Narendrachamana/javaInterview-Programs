package com.Day1;

import java.util.ArrayList;

public class RemoveDuplicateWithoutCollections {

	public static void main(String[] args) {
		
		
		
	ArrayList <Object> al=new ArrayList<Object>();
	
	al.add("narendra");
	al.add(23);
	al.add("narendra");
	al.add(34);
	al.add('s');
	al.add('s');
	
	System.out.println("before duplicate removing  "+al);
	
	for(int i=0;i<al.size();i++)
	{
		for(int j=i+1;j<al.size();j++)
		{
			if(al.get(i).equals(al.get(j)))
			{
				al.remove(j);
			}
		}
	}
	System.out.println(al);
	
	
	
		
	}

}
