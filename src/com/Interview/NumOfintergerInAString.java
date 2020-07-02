package com.Interview;

public class NumOfintergerInAString {

	public static void main(String[] args) {
		
		String s="hjsk2n3jn4jn";
		
		int l=s.length();
		int temp=0;
		
		String digit="";
		for(int i=0;i<l;i++)
		{
		char ch=s.charAt(i);
		if(Character.isDigit(ch))
		{
			digit=digit+ch;
			System.out.print(ch+" +");
			
		}
		//System.out.println();
		//break;
	}
		System.out.println();
		//break;
		int num=Integer.parseInt(digit);
		while(num>0) {
		int n=num%10;
		temp=temp+n;
		num=num/10;
		}
		System.out.println("total sum of digits: "+temp);
}
	
}
