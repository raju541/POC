package com.cts.ehdemo;

public class MyOwnexceptiontest {
	
	public void add(String a,String b) throws Myownexception {
	try {	
	int x=	Integer.parseInt(a);
	int y=	Integer.parseInt(b);
	x=x+y;
	System.out.println(x);
	}catch (Exception e) {
		e.printStackTrace();
		throw new Myownexception("Input should be integer");
	}	
	}
	

	public static void main(String[] args) throws Myownexception {
		// TODO Auto-generated method stub
		
		MyOwnexceptiontest myOwnexceptiontest=new MyOwnexceptiontest();
		myOwnexceptiontest.add("5", "5a");

		

	}

}
