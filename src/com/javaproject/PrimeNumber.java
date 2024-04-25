package com.javaproject;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 19; // Example number to check
		System.out.println(isPrime(number) ? number + " is a prime number." : number + " is not a prime number.");
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		// This for loop starts at i = 3 because 1 and 2 are not considered for
		// divisibility checks.
		// The loop continues as long as i is less than or equal to the square root of
		// the number.
		// The increment i += 2 is used because all even numbers greater than 2 are not
		// prime,
		// so we can safely skip them by incrementing by 2 each time.
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
