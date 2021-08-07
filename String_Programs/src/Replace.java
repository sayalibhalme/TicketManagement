import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sentence = sc.nextLine();

		spitMethod(sentence);
	}

	private static void spitMethod(String sentence) {

		String word = "";

		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) != ' ') {

				word = word + sentence.charAt(i);

			} else {

				for (int j = 0; j < word.length(); j++) {

					if (j % 2 != 0) {

						System.out.print(1);

					} else {
						System.out.print(word.charAt(j));
					}

				}
				System.out.print(" ");

				word = "";
			}

		}
		for (int j = 0; j < word.length(); j++) {

			if (j % 2 != 0) {
				System.out.print(1);

			} else {
				System.out.print(word.charAt(j));
			}

		}
	}
}
