package com.Day2;

public class Polymorphism extends Parent {

	public void put()
	{
		System.out.println("child class");
	}
	
	public static void main(String[] args) {
		
		
		Parent obj=new Polymorphism();
		obj.set();
		
		Polymorphism obj2=new Polymorphism();
		obj2.put();
	
	}

}

class Parent
{
	public void set()
	{
		
		System.out.println("parent class");
	}
}
