package com.cts.covariant;

public class B extends A{
	
		
		public B m1() {
			
			System.out.println("m1() in class B");
			return new B();
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			B b=new B();
			b.m1();
			
		}
	
}
