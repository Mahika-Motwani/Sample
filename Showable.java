package com.test;

public interface Showable {
	
	int data=40;
	
	void show();
	
	
	default void m1()
	{
		System.out.println("m1 from Showable");
	}
	
	
}
