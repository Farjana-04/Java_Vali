package com.javaproject;

public class ReverseInteger {

	public static void main (String[] args) {
		int num = 1234;
		int reverse = 0;
		while(num != 0) {
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		System.out.println("Reverse Integer is " +reverse);
		

	}
	

}
