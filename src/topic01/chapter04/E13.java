package topic01.chapter04;
import java.util.Scanner;
public class E13 {
// Check if input is a vowel or consonant
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.next();
		char ch = letter.charAt(0);
		
		// Create a vowel string
		String vowels = "a e i o u A E I O U";
		// Use equals to find if it is a vowel
		if (vowels.contains(letter))
			System.out.println(letter + " is a vowel.");
		else if (!vowels.contains(letter) && Character.isLetter(ch))
			System.out.println(letter + " is a consonant.");
		else
			System.out.println(ch + " is an invalid input.");
		
		input.close();
	}

}
