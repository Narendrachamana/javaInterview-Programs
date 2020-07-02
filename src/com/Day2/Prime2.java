package com.Day2;

public class Prime2 {

	public static void main(String[] args) {
	
		int number=20;
		String prime ="";
		
		for(int i=1;i<=number;i++)
		{
			int counter=0;
			
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					
					counter=counter+1;
					
					
					
				}
				
				
			}
			if(counter==2)
			{
			prime=prime +i+" ";
			
			
				
			}
			
			
			
			
		}
		System.out.println(prime);
		
		
		
	}
	
}
