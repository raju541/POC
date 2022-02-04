package com.scb.poc;


public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton1=Singleton.getSingleton();
		Singleton singleton2=Singleton.getSingleton();
		if(singleton1==singleton2) {
			
			System.out.println("singleton");
		}else {
			
			
			System.out.println(" non singleton");
		}
		
		
		
	}

}
