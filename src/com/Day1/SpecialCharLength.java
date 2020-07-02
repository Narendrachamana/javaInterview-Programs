package com.Day1;

public class SpecialCharLength {

	public static void main(String[] args) {
		
		
		String s="tesjmnjst@123";
		int l=s.length();
		//solution-1
		System.out.println(s.indexOf('@'));
		//System.out.println(l);
		
		//solution -2
		String arr[]=s.split("@");
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("@ character length is "+arr[0].length());
		
		
	}

}
