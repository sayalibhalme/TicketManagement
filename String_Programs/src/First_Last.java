

import java.util.Scanner;

public class First_Last {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");

		String sentance = sc.nextLine();

		spitMethod(sentance);

	}

	private static void spitMethod(String sentance) {
		String word = ""; // store character

		for (int i = 0; i < sentance.length(); i++) {

			if (sentance.charAt(i) != ' ') {
				word = word + sentance.charAt(i); // if not space character store in word

			} else {
				
				System.out.print(word.charAt(0)+""+word.charAt(word.length()-1)+" ");
				word = "";
			}

		}
		System.out.print(word.charAt(0)+"" +word.charAt(word.length()-1));
	}
}
