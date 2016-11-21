package topic04.chapter05;
import java.util.Scanner;
public class E01 {
// Count positive and negative numbers and compute the averages
// And program ends with zero
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Scanner and get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		// Prep for loop
		double sum = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		double number;
		
		// Create do-while loop (because we need it to run at least once)
		// But terminates at zero
		do {
			number = input.nextDouble();
			sum += number;
			if (number > 0)
				positiveCount++;
			else if (number < 0)
				negativeCount++;
		}
		while (number != 0);
		
		// Find the average
		double average = sum / (positiveCount + negativeCount);
		
		// Display results
		System.out.println("The number of positives is " + positiveCount + "\nThe number of negatives is " +
				negativeCount + "\nThe total is " + sum + "\nThe average is " + average);
		
		input.close();
		
	}

}
