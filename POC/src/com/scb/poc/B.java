package com.scb.poc;

public class B extends A{
public void m2() {
		
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		//A a=new A();
		//
		//a.m1();
		
		B b=new B();
		b.m1();
		b.m2();
	}

}
