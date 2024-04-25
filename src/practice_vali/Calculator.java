package practice_vali;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// we use Scanner to get input to the user
		Scanner keyboardInput = new Scanner(System.in);
		//Calculator
//		System.out.print("Enter the first number: ");
//		double num1 = keyboardInput.nextDouble();
//		System.out.print("Enter the second number: ");
//		double num2 = keyboardInput.nextDouble();
//		System.out.println(num1 + num2);
		
		// Building a better Calculator with If statement
		System.out.println("Enter a Number: ");
		double num1 = keyboardInput.nextDouble();
		
		System.out.println("Enter an Operator: ");
		String op = keyboardInput.next();
		
		System.out.println("Enter another Number: ");
		double num2 = keyboardInput.nextDouble();
		
		if(op.equals("+")) {
			System.out.println(num1 + num2);
		}else if(op.equals("-")) {
			System.out.println(num1 - num2);
		}else if(op.equals("/")) {
			System.out.println(num1 / num2);
		}else if(op.equals("*")) {
			System.out.println(num1 * num2);
		}else {
			System.out.println("Invalid Operator");
		}
		
		//Mad libs
//		System.out.print("Enter a color: ");
//		String color = keyboardInput.nextLine();
//		
//		System.out.print("Enter a plural noun: ");
//		String plural = keyboardInput.nextLine();
//		
//		System.out.print("Enter a person: ");
//		String person = keyboardInput.nextLine();
//		
//		System.out.println("Roses are " + color + " \n"
//				+ plural + " are blue \n"
//				+ "Hello " + person);

	}

}
