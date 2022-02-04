package com.scb.poc;

public class C {

	public C() {
		
		System.out.println("b default");
	}
	public C(int a) {
		super();
		System.out.println("b"+a);
	}
	public C(int a,int b) {
		this(1);
		System.out.println("b"+a+b);
	}
	public static void main(String[] args) {
		C c=new C();
	}
}
