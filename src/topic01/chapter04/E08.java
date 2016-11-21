package topic01.chapter04;
import java.util.Scanner;
public class E08 {
// Receives an ASCII and displays its character
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code (an integer between 0 and 127): ");
		int ascCode = input.nextInt();
		
		// Display character
		System.out.println("The character for ASCII cod " + ascCode + " is " + (char)ascCode);
		
		input.close();
	}

}
