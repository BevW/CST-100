package topic01.chapter02;

import java.util.Scanner;

public class E17 {
	//Find how cold it is outside with other factor that just temp
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
			
			// Display wind-chill
			System.out.println("the wind chill index is " + twc);
			
			input.close();
	}

}
