package com.scb.poc;

public class WrapperClass {
	
		int a=10;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WrapperClass wc=new WrapperClass();
		System.out.println("a = "+wc.a);
		
		Integer i=wc.a;					//AutoBoxing(Primitive into Object)
		System.out.println("i = "+i);
		
		
		int b=i;						//UnBoxing(Object into Primitive)
		System.out.println("b = "+b);

		Integer k=Integer.valueOf(b);
		System.out.println("k = "+k);
		
	}

}
