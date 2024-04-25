package com.javaproject;

public class ConvertStringToInteger {

	public static void main(String[] args) {

		String str = "416";
		int num;
		try {
			num = Integer.parseInt(str);
//			num = Integer.valueOf(str); //another method
			System.out.println("Converted integer: " + num);
		} catch (NumberFormatException e) {
			System.out.println("Invalid integer input");
		}

	}

}
