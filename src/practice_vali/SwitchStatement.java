package practice_vali;

public class SwitchStatement {

	public static void main(String[] args) {
	System.out.println(getDayName(40));	

	}
	public static String getDayName(int dayNum) {
		String dayName = "";
		
		switch(dayNum) {
		case 0: dayName = "Sunday";
		break;
		case 1: dayName = "Monday";
		break;
		case 2: dayName = "Tuesday";
		break;
		case 3: dayName = "Wednesday";
		break;
		case 4: dayName = "Thursday";
		break;
		case 5: dayName = "Friday";
		break;
		case 6: dayName = "Saturday";
		break;
		default: dayName = "Invalid Number";
		break;
		}
		
		
		return dayName;
	}

}
//Switch statement is particularly useful when you have a single variable or expression that can take multiple values, 
//and you want to execute different blocks of code depending on the value of that variable or expression.
