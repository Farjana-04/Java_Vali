package com.javaproject;

public class CheckArmstrong {
    public static void main(String[] args) {
//        int number =  153; 
    	int number =  9474;// Replace with the number you want to check
        System.out.println(isArmstrongNumber(number) ? number + " is an Armstrong number." : number + " is not an Armstrong number.");
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber, remainder, n =  0, result =  0;

        originalNumber = number;

        // Count the number of digits
        while (originalNumber !=  0) {
            originalNumber /=  10;
            ++n;
        }

        originalNumber = number;

        // Calculate the sum of the digits raised to the power of the number of digits
        while (originalNumber !=  0) {
            remainder = originalNumber %  10;
            result += Math.pow(remainder, n);
            originalNumber /=  10;
        }

        return result == number;
    }
}


	   
	

