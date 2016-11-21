package topic02.chapter03;
import java.util.Scanner;
public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create two random numbers between 0 and 100
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		// Get answer/input from user
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		// Display the result
		if (number1 + number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
		
		input.close();
	}

}
