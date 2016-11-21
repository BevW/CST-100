package topic02.chapter03;
import java.util.Scanner;
public class E14 {
// Make a game that allows the user to guess if a coin flip will be head or tails
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Random 0 or 1
		int random = (int)(Math.random() * 2);
		
		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Heads is 1 and Tails is 0\nEnter your guess: ");
		int guess = input.nextInt();
		
		// Compare the users guess with the random number
		if (random == guess)
			System.out.println("The flip was " + random + ". You WIN!");
		else
			System.out.println("The flip was " + random + ". Sorry, you lose.");
		
		input.close();
	}

}
