package com.Day2;

public class PrimeNumber {

	public static void main(String[] args) {

     int i= 0;
     String primeNumber=" ";
     
     for( i=1;i<20;i++)
     {
    	 
    	 int counter=0;
    	 
    	 for(int num=i;num>=1;num--)
    	 {
    	 
    	 if(i%num==0)
    	 {
    		counter =counter+1;
    		
    	 }
    	 }
    	 if(counter==2)
    	 {
         		 primeNumber= primeNumber+ i + "  ";
    		
    	 }
    	
     }
     
	 System.out.println("1 to 20 prime number are:" );
	 System.out.println(primeNumber );

     
	}
}