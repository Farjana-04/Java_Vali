package practice_vali;

public class ForLoop {

	public static void main(String[] args) {
//		String []cities = {"Allen", "Plano", "Mckinney", "Frisco"};
//		for(int i = 0; i < cities.length; i++) {
//			System.out.println(cities[i]);
//		}
//		System.out.println(pow(5,3));
//	}
//	public static int pow(int baseNum, int powNum) {
//		int result = 1;
//		for(int i = 0; i < powNum; i++) {
//			result = result * baseNum;
//		}
//		return result;
		
		//Using Nested loop and Dimensional Array
		
		int [][] numberGrid = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{0}
		};
		for (int i = 0; i < numberGrid.length; i++) {
			
			for(int j = 0; j < numberGrid[i].length; j++) {
				System.out.print(numberGrid[i][j]);
			}
			System.out.println();
			
		}
	}

}
