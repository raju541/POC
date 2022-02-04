package com.cts.ehdemo;

public class Imutabletest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee("abc");
System.out.println(emp.empno);
Employee emp1=new Employee("abc");
System.out.println(emp.empno.concat("abb"));
System.out.println(emp.empno);}

}
