package com.scb.poc;

public class Constuctor {
	int a;
	public Constuctor(){
		
		System.out.println("defalult");
	}
	public Constuctor(int a){
		this.a=a;
		
		System.out.println("int"+a);
	}
	public Constuctor(String a){
		System.out.println("string "+a);
	}
	public Constuctor(int a,int b){
		System.out.println("two parter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constuctor c=new Constuctor();
		Constuctor c1=new Constuctor(1);
		Constuctor c2=new Constuctor("raju");
		Constuctor c3=new Constuctor(1,2);
		
		
	}

}
