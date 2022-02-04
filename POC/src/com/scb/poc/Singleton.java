package com.scb.poc;

public class Singleton {
	
	private static Singleton obj=null;
	private Singleton() {}
	
	public static Singleton getSingleton() {
		
		if(obj==null) {
			synchronized (Singleton.class) {
				if(obj==null) {
				
                obj=new Singleton();
				}
			}
		}
		return obj;
	}
	
}
