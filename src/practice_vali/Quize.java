package practice_vali;

import java.util.Scanner;

public class Quize {

	public static void main(String[] args) {
		String q1 = "What color are apples? \n"
				+ "(a) red/green \n(b) Megenda \n(c) yellow \n ";
		String q2 = "What color are bananas? \n"
				+ "(a) red/green \n(b) Blue \n(c) yellow \n ";
		
		Questions [] question = {
				new Questions(q1, "a"),
				new Questions(q2, "b")
		};
		takeTest(question);
	}
		public static void takeTest(Questions [] question) {
			int score = 0;
			
			Scanner keyboardInput = new Scanner(System.in);
			
			for (int i =0; i < question.length; i++) {
				System.out.println(question[i].prompt);
				String answer = keyboardInput.nextLine();
				if(answer.equals(question[i].answer)){
					score++;
				}
			}
			System.out.println("you got "+ score + "/" + question.length);
		}

	}


