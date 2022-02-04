package com.cts.covariant;

public class Y  extends X{

	public B m1() {
		
		System.out.println("m1() in class B");
		return new B();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A y=new B();
		y.m1();
		
	}
}
