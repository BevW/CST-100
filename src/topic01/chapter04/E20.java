package topic01.chapter04;
import java.util.Scanner;
public class E20 {
// Displays the length and 1st character of a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		// Get length of string
		int length = str.length();
		
		// Get 1st character
		char firstCh = str.charAt(0);
		
		// Display results
		System.out.println("The lenght is " + length + " and the first character is " + firstCh);
		
		input.close();
	}

}
