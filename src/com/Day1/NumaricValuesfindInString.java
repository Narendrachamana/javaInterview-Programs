package com.Day1;

public class NumaricValuesfindInString {

	public static void main(String[] args) {
		
		String s="test123abc879";
		
		int sum=0;
		String digit="";
		int l=s.length();
		
		for(int i=0;i<l;i++)
		{
			
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				digit=digit+ch;
				
				System.out.print(ch +"+");
			}
		}
		System.out.println();
			
			int num=Integer.parseInt(digit);
			int temp=0;
			
			while(num>0)
			{
				int n=num%10;
				temp=temp+n;
				num=num/10;
				
			}
			
			System.out.println("total sum of digits: "+temp);
			
		}
		
		
		
		
	

}
