package com.Interview;

public class StringComparsion {

	public static void main(String[] args) {
		
		
		String s1="narend12323";
		String s2="narendra";
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1!=l2)
		{
			System.out.println("both string lenth are not equal");
		}
		boolean flag=true;
		for(int i=0;i<l1;i++)
		{
			
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.println("String characters are differents");
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("given strings are equal");
		}
		else
		{
			System.out.println("given strings are not equal");
		}
		
		
	}

}
