package com.scb.string.coding;


public class StringReverseExample {
	
	public String stringReverse(String str){
		
		StringBuffer sb=new StringBuffer(str);
		String revstr=sb.reverse().toString();
		
		
		return revstr;
		}
		
public StringBuffer stringReverse2(String str){
		
	char[] characters = str.toCharArray();	
	StringBuffer sb=new StringBuffer();
		for(int i=str.length()-1; i>=0; i--) {

			sb.append(characters[i]);	
		}
		return sb;
		
		}


public  String reverseRecursively(String str) {

    if (str.length() < 2) {
        return str;
    }
System.out.println(str.substring(1));
System.out.println("#########"+str.charAt(0));
    return reverseRecursively(str.substring(1)) + str.charAt(0);

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverseExample stringReverseExample=new StringReverseExample();
		String sb=stringReverseExample.stringReverse("abc");
		System.out.println(sb);
		
		
		StringBuffer st=stringReverseExample.stringReverse2("abc");
		System.out.println(st);
		
		
		
		String rip=stringReverseExample.reverseRecursively("abc");
		System.out.println(rip);
	}

}
