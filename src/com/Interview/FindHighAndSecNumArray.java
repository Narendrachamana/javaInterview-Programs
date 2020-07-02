package com.Interview;

public class FindHighAndSecNumArray {

	public static void main(String[] args) {
		
		int a[]= {20,30,344,2133,2232};
		
		int first=0;
		int secound=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>first)
			{
				secound=first;
				first=a[i];
				
			}
			else if(a[i]>secound)
			{
				secound=a[i];
			}
			
		}
		System.out.println(first +"----->"+secound);
		
	}

}
