package com.scb.poc;

public class Demo {
	
	public void m1(Demo d)
	{
		d.m2();
	}
	public void m2()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo D=new Demo();
		D.m1(D);
		
	}

}
