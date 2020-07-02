package com.Interview;

public class PalindromeString {

	public static void main(String[] args) {
			
		String s="malayalam";
		
		String actual="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			actual=actual+s.charAt(i);
			
			
		}
		
		if(actual.equalsIgnoreCase(s))
		{
			
			System.out.println("Given String is palindrome" );
		}
		else {
			System.out.println("Given String is not a palindrome");
		}
		
		
	}

}
