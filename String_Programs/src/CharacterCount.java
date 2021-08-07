
import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sentance = sc.nextLine();

		spitMethod(sentance);
	}

	private static void spitMethod(String sentance) {

		String word = ""; // store character
		int count = 0;

		for (int i = 0; i < sentance.length(); i++) {

			if (sentance.charAt(i) != ' ') {
				word = word + sentance.charAt(i);
				count++;

			} else {

				System.out.print(word.charAt(0) + "" + count + " ");
				word = "";
				count = 0;
			}
		}
		System.out.print(word.charAt(0) + "" + count + " ");
	}
}
