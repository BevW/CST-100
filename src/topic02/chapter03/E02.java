package topic02.chapter03;
import java.util.Scanner;
public class E02 {
// Rewrite Listing 3.1 for adding three integer instead of two
	public static void main(String[] args) {
		
		// Create random numbers 1 to 10
		int number1 = (int)(1 + Math.random() * 10);
		int number2 = (int)(1 + Math.random() * 10);
		int number3 = (int)(1 + Math.random() * 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Get input from user
		System.out.print(
		"What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		int answer = input.nextInt();

		// Display answer as true or false
		System.out.println(
		number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
		(number1 + number2 + number3 == answer));
		
		input.close();
		}
}
