package com.cts.stringdemo;

public class StudentTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		
			Student st1=new Student(1,"a");
			Student st2=new Student(1,"a");
			
			//st1.setId(1);
			//st2.setId(1);
			
			if(st1.hashCode()==st2.hashCode()){
				 if(st1.equals(st2)) 
		                System.out.println("Both Objects are equal. "); 
		            else
		                System.out.println("Both Objects are not equal.... "); 
		      
			}else {
			System.out.println("Both Objects are not equal...");
		
		
			}
	}

}
