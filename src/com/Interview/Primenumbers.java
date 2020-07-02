package com.Interview;

public class Primenumbers {

	public static void main(String[] args) {
		
		
		int num=20;
		
		String prime=" ";
		for(int i=0;i<20;i++)
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
				prime=prime+i+" ";
				
			}
		}
		System.out.println(prime);
		
	}

}
