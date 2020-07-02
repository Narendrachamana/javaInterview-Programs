package com.Day1;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s="malayalam";
		String rev="";
		
		
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
		
		{
			
			System.out.println("given string is palindrome");
		}
		else
		{
			System.out.println("given string is not a palindrome");
		}
		
	}

}
