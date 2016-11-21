package topic01.chapter04;
import java.util.Scanner;
public class E11 {
// Receives and integer 0-15 and displays hex number
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int integer = input.nextInt();
		
		// Converts to and displays hex number
		if (integer >= 0 && integer <= 9)
			System.out.println("The hex value is " + integer);
		else if (integer >= 10 && integer <= 15)
			System.out.println("The hex value is " + (char)(integer + 'A' - 10));
		else
			System.out.println(integer + " is an invalid input");
		
		input.close();
	}

}
