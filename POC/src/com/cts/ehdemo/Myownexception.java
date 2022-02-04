package com.cts.ehdemo;

public class Myownexception extends Exception {
	private String msg;
	
	public Myownexception() {}
	public Myownexception(String msg) {
		
		this.msg=msg;
		System.out.println(msg);
	
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
