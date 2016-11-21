package topic01.chapter04;
import java.util.Scanner;
public class E09 {
// Receives a character and displays its Unicode
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		
		// Display characters Unicode
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
		
		input.close();
	}

}
