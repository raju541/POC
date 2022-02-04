package com.cts.threaddemo;

public class Mythread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("main");//running
		try {
			System.out.println(Thread.currentThread());
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("after sleep");	
	}
	
	public static void main(String[] args) {
		Mythread t1=new Mythread();//new
		t1.setName("prasad");
		Mythread t2=new Mythread();//new
		t2.setName("raju");
		t2.setPriority(1);
		t1.start();//runnable stae
		t2.start();
	}
}
