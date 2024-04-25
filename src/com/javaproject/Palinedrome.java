package com.javaproject;

public class Palinedrome {

	//public static void main(String[] args) {
//		String in = "racecar";
//		String out = "";
//		for (int i = in.length() - 1; i >= 0; i--) {
//			out = out + in.charAt(i);
//		}
//		if (in.equals(out)) {
//			System.out.println(in + " is a palinedrome");
//		} else {
//			System.out.println(in + " is not a palinedrome");
//		}
		public static void main(String[] args) {
			
		String in ="MADAM";
		String out = "";
		for(int i = in.length()-1; i >= 0; i--) {
			out = out + in.charAt(i);
		}
		if(in.equals(out)) {
			System.out.println(in + " is a palinedrome");
		}else {
			System.out.println(in + " is not a palinedrome");
		}

	}

}
