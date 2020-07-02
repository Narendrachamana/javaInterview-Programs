package com.Day1;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num=20;
		String prime=" ";
		
		for(int i=0;i<=num;i++)
		{
			int count=0;
			
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					count=count+1;
				}
			}
			
			if(count==2)
			{
				prime=prime+i+" ";
				
			}
		
			
		}
		System.out.println(prime);
		
		
		
	}

}
