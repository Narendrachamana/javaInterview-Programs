package com.Day2;

public class Multiplication {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			
			if(i%3==0)
			{
				System.out.println("health care" +i);
			}
		 if(i%5==0)
			{
				System.out.println("ci" + i);
				
			}
			 if(i%3==0 && i%5==0) {
				System.out.println("heathcare ci"+ i);
			}
			
		}
		
	}

}
