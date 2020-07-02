package com.Interview;

public class NumberOfCharacterInaString {

	public static void main(String[] args) {
		final int MAX_CHAR=256;
		String s="narendra";
		
		int l=s.length();
		int count[]=new int[MAX_CHAR];
		for(int i=0;i<l;i++)
		{
			count[s.charAt(i)]++;
		}
		
		char ch[]=new char[l];
		
		for(int j=0;j<l;j++)
		{
			ch[j]=s.charAt(j);
			int find=0;
			for(int i=0;i<=j;i++ )
			{
				if(s.charAt(j)==ch[i])
					
				{
					find++;
				}
			}
			if(find==1)
			{
				System.out.println(s.charAt(j)+"---->"+count[s.charAt(j)]);
				
			}
			
		}
		
		
	}

}
