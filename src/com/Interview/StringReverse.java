package com.Interview;

public class StringReverse {

	public static void main(String[] args) {
		
		String n="Jai sriram";
		
		String temp="";
		
		for(int i=n.length()-1;i>=0;i--)
		{
			temp=temp+n.charAt(i);
			
		}
		System.out.println(temp);
		
		
		
	}

}
