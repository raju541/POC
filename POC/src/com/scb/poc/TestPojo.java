package com.scb.poc;

public class TestPojo {
	public TestPojo(String name){}
	
	
	
	public static void main(String[] args) {
		TestPojo t1=new TestPojo("abc");
		TestPojo t2=new TestPojo("abc");
		
		String a="abc";
		String b="abc";
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(t1.equals(t2));
		System.out.println(t1==t2);
		System.out.println(t1.getClass());
		
	}
	
}


