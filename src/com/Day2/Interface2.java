package com.Day2;

interface A
{
	public void a();
	public void b();
	public void c();
	public void d();
	
	
}

abstract class B implements A
{
  
	public void a()
	{
		System.out.println("this is a method");
	}
	
}

public class Interface2 extends B{
	
	
	public void b()
	{
		System.out.println("this is b method");	
	}
	
	public void c()
	{
		System.out.println("this is c method");	
	}
	
	public void d()
	{
		System.out.println("this is d method");	
	}
	public static void main(String[] args) {
		
		A obj=new Interface2();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}
