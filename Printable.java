package com.test;

public interface Printable {
	
	int data=50;
	
	void print();
	
	default void m1()
	{
		System.out.println("m1 from Printable");
	}
	
	static void m2()
	{
		System.out.println("m2 from Printable");
	}
		
}
