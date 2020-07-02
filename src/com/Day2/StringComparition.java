package com.Day2;

public class StringComparition {

	public static void main(String[] args) {
			
		String str1="Narendra";
		String str2="Narendra";
		
		int l1=str1.length();
		int l2=str2.length();
		
		
			if(l1!=l2)
			{
				System.out.println("string are not equal value");
				return;
			}
			boolean flag=true;
			for(int i=0;i<l1;i++)
			{
			
			if(str1.charAt(i)!=str2.charAt(i))
			{
				flag= false;
				
				break;
				
			}
			
			
		}
		
			
			if(flag)
			{
				System.out.println("string are same");
			}
			else 
			{
				
				System.out.println("String are not same");
			}
	}

}
