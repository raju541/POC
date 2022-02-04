package com.scb.poc;

public class Calacutor {
	int i;
	boolean bo;
	byte byt=127;
	char ch;
	long l;
	short s;
	float f= 12.5250000000000000f;
	double d=12.5250000000000000;
	String str="prasad";
	private void defaultvalues() {
		System.out.println("int default value :"+i);
		System.out.println("boolean default value :"+bo);
		System.out.println("char default value :"+ch);
		System.out.println("long default value :"+l);
		System.out.println("short default value :"+s);
		System.out.println("float default value :"+f);
		System.out.println("double default value :"+d);
		System.out.println("byte default value :"+byt);
		System.out.println("String name is:"+str);
	}
	/*
	 * public void add(int a, int b) {
	 *  a= a+b;
	 * 
	 * System.out.println("Sum is :"+a); }
	 * 
	 * 
	 */
public int add(int a) {
	
		
return a;
	}
	public int add(int a, int b) {
		
		int g=	a+b;
		
return g;
	}
	public int add(int a, int b,int c) {
		
		int e=	a+b+c;
		
return e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calacutor calacutor=new Calacutor();
		//calacutor.add(6);
		//calacutor.add(6, 4);
		int re=calacutor.add(2, 4, 9);
		System.out.println("result="+re);
		calacutor.defaultvalues();
	}

}
