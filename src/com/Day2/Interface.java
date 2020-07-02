package com.Day2;




interface num
{                                                                                                                                                                                                                                                                
	public void put();
	static void print()
	{
		System.out.println("static");
	}
	
	
}


interface draw
{
	public void interset();
	

default void get()
{
	System.out.println("default");
	
}
}



public class Interface  implements num,draw {


		public void put()
		{
			System.out.println("hai");
		}
		
		public void interset()
		{
			
				int number=0;
				number=number+1;
			
			System.out.println(number);
		}
		public static void main(String[] args) {
		
		Interface in=new Interface();
		in.put();
		in.interset();		
		num.print();
		in.get();
		
	}

}
