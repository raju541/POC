package com.cts.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * StringBuffer b=new StringBuffer("abc"); b.append("bcd");
		 * System.out.println(b);
		 * 
		 * 
		 * String p= "abc"; String x=p.concat("abc"); System.out.println(x);
		 */
		
		
		String c= "abc";
		char[] m=c.toCharArray();
		
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]);
		}
	}

}
