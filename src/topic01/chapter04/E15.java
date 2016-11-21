package topic01.chapter04;
import java.util.Scanner;
public class E15 {
// (Phone key pads) Receives a letter and displays its corresponding number
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String letter = input.next();
		
		// Use and if statement to attach letters to numbers
		if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("c"))
			System.out.println("The corresponding number is 2");
		else if (letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("f"))
			System.out.println("The corresponding number is 3");
		else if (letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h") || letter.equalsIgnoreCase("i"))
			System.out.println("The corresponding number is 4");
		else if (letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("l"))
			System.out.println("The corresponding number is 5");
		else if (letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n") || letter.equalsIgnoreCase("o"))
			System.out.println("The corresponding number is 6");
		else if (letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s"))
			System.out.println("The corresponding number is 7");
		else if (letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("v"))
			System.out.println("The corresponding number is 8");
		else if (letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("y")|| letter.equalsIgnoreCase("z"))
			System.out.println("The corresponding number is 9");
		else
			System.out.println(letter + " is an invalid input");
		
		input.close();
	}

}
