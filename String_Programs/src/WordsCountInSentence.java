
import java.util.Scanner;

public class WordsCountInSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sentance = sc.nextLine();

		spitMethod(sentance);
	}

	private static void spitMethod(String sentance) {

		String word = ""; // store character
		int wordCount = 0;

		for (int i = 0; i < sentance.length(); i++) {

			if (sentance.charAt(i) != ' ') {
				
				word = word + sentance.charAt(i);

			} else {

				wordCount++;
				word = "";
			}
		}
		wordCount++;
		System.out.println("Total Words in sentence " + wordCount);
	}
}
