package com.cts.threaddemo;

public class MyRunableThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunableThread myRunableThread=new MyRunableThread();
		Thread t1=new Thread(myRunableThread);
		t1.start();
	}

}
