package com.cts.stringdemo;

public class Demo {
	
	public static void main(String[] args) {
		
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		int[] num={1,2,3,4};  
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			
		}
		
		for (char cp : ch) {
			System.out.println(cp);
		}
		
		for (int cp : num) {
			System.out.println(cp);
		}
	}

}
