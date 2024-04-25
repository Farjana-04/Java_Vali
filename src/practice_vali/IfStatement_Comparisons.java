package practice_vali;

public class IfStatement_Comparisons {

	public static void main(String[] args) {
		// Maximum value	
    System.out.println(max(4, 5, 6));
	}
	public static int max(int num1, int num2, int num3) {
		if(num1 >= num2 && num1 >= num3) {
			return num1;
		}else if(num2 >= num1 && num2 >= num3) {
			return num2;
		}else{
			return num3;
		}
	}

}
