package com.Day2;

public class TwoStringSwap {

	public static void main(String[] args) {
		
		String a="Narendra";
		String b="kumar";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		
		
		System.out.println("after swap "+ a +" "+b);
		
	}

}








