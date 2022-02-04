package com.scb.poc;

public class VariblesDemo {
	
	int a=10;
	
	static int b=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		VariblesDemo x=new VariblesDemo();
		
		System.out.println(x.a);
		System.out.println(x.b);
		//System.out.println(VariblesDemo.b);
		VariblesDemo y=new VariblesDemo();
		y.a=20;
		y.b=20;
		System.out.println(x.a);
		System.out.println(x.b);

	}

}
