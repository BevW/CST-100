package topic04.chapter05;
import java.util.Scanner;
public class E02 {
// Revise Listing 5.4 to generate 10 addition questions for 2
// Integers between 1 and 15
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMBER_OF_QUESTIONS = 10; // Number of questions
		int correctCount = 0; // Count the number of correct answers
		int count = 0; // Count the number of questions
		long startTime = System.currentTimeMillis();
		String output = " "; // output string is initially empty
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTIONS) {
		// Generate two random single-digit integers
		int number1 = 1 + (int)(Math.random() * 15);
		int number2 = 1 + (int)(Math.random() * 15);
	
		// Prompt the student to answer "What is number1 – number2?"
		System.out.print(
		"What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		// Grade the answer and display the result
		if (number1 + number2 == answer) {
		System.out.println("You are correct!");
		correctCount++; // Increase the correct answer count
		}
		else
		System.out.println("Your answer is wrong.\n" + number1
		+ " + " + number2 + " should be " + (number1 + number2));
	
		// Increase the question count
		count++;
	
		output += "\n" + number1 + "+" + number2 + "=" + answer +
		((number1 + number2 == answer) ? " correct" : " wrong");
		
		}
	
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
	
		System.out.println("Correct count is " + correctCount +
		"\nTest time is " + testTime / 1000 + " seconds\n" + output);
		
		input.close();
	}

}
