package com.javaproject;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		// Replace 153 with the number you want to check
        checkArmstrong(153);
	}
	public static void checkArmstrong(int a) {
	    int num1 = a;
	    int total = 0;
	    int temp;

	    while (num1 != 0) {
	        temp = num1 % 10;
	        total = total + (temp * temp * temp);
	        num1 = num1 / 10;
	    }

	    if (a == total) {
	        System.out.println(a + " is an Armstrong number");
	    } else {
	        System.out.println(a + " is not an Armstrong number");
	    }
	}


}
