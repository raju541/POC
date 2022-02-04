package com.cts.ehdemo;

public class EHdemo {

	public static void main(String[] args) {
		try {
		String num="123";
		int number=Integer.parseInt(num);
		//System.out.println(number);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			 String str= null;
		        
		     // System.out.println(str.charAt(1));
		      
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		try {
	    int arr[]= {1,3,5,7};  
        System.out.println(arr[10]);
        
       
        
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
		
		 String str= "prasad";
	        
	      //System.out.println(str.charAt(1));
	      
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		  //System.out.println("HI");
	}

}
