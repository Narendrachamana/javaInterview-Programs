package com.Day2;

public class ReverseString {

	public static void main(String[] args) {
			String  str="Primed Education Solution";
			String rev="";
			
		int length=str.length();
		
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
			
			
	}

}
