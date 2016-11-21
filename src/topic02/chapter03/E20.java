package topic02.chapter03;

import java.util.Scanner;

public class E20 {
// Edit Exercise 2.17 to tell when an invalid input is entered
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between - 58°F and 41°F: ");
		double ta = input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double v = input.nextDouble();
		
		// Calculate the wind-chill
		double twc = 35.74 + (.6215 * ta) - (35.75 * Math.pow(v, .16)) + (.4275 * ta * Math.pow(v, .16));
		
		// Check for valid input and display
		if ((ta <= -58 || ta >= 41) || (v < 2))
			System.out.println("The entered temperature or wind speed is not valid");
		// Display wind-chill
		else
			System.out.println("The wind chill index is " + twc);
		
		input.close();
	}

}
