
import java.util.Scanner;

public class EmailMaking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String sentence = sc.nextLine();

		spitMethod(sentence);
	}

	private static void spitMethod(String sentence) {

		String word = ""; // store character

		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) != ' ') {

				word = word + sentence.charAt(i);

			} else {
				System.out.print(word + ".");
				word = "";
				break;
			}

		}
		
		  for (int i = 0; i < sentence.length(); i++) {
		  
		  if (sentence.charAt(i) != ' ') {
		  
		  word = word + sentence.charAt(i);
		  
		  } else { word = ""; }
		  
		  }
		 
		System.out.print(word + "@mindtree.com");
	}
}
