package com.test;

public class Test implements Printable, Showable {

	public static void main(String[] args) {
		Test t=new Test();
		t.print();
		t.show();
		t.m1();
		Printable.m2();
		

	}
	
	
	
	@Override
	public void print() {
		System.out.println("Hello");
		
		
	}

	@Override
	public void show() {
		System.out.println("How are you?");
		
	}



	@Override
	public void m1() {
		System.out.println("m1 from Test");
	}

}
