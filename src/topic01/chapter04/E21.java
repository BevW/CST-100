package topic01.chapter04;
import java.util.Scanner;
public class E21 {
// Checks if a SSN is valid
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a SSN with (-): ");
		String ssn = input.nextLine();
		
		// Check if it is valid (in back of book)
		System.out.println(ssn.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}") ? ssn +
				" is a valid SSN" : ssn + " is an invalid SSN");
		
		input.close();
	}

}
