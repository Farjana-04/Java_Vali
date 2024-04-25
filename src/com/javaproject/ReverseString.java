package com.javaproject;

public class ReverseString {

//	public static void main(String[] args) {
//		String in = "Software";
//		String out = "";
//		for(int i = in.length()-1; i >= 0; i--) {
//			out = out + in.charAt(i);
//		}
//		System.out.println("Reverse string is " + out);
//
//	}
	
	
	/*The reverse() method of Java StringBuilder class is used to replace this character sequence by the reverse of the sequence. If the sequence contains any surrogate pairs, they are treated as a single character for the reverse operation.*/
	public static void main(String[] args) {  
        StringBuilder sb = new StringBuilder("programming");  
        System.out.println("string = " + sb);  
        // reversing of stringbuilder  
        System.out.println("reverse = " + sb.reverse());  
    }  

}
