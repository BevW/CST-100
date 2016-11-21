package topic01.chapter04;

import java.util.Scanner;

public class E01 {
// Compute the area of a pentagon
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the length from the center to a vrtex: ");
				double r = input.nextDouble();
				
				// Find the length of the sides
				double s = 2 * r * Math.sin(Math.PI / 5);
				
				// Find the area
				double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
				
				// Display area with rounded 2 digit after the decimal
				System.out.printf("The area of the pentagonn is %.2f", area);
				
				input.close();
	}

}
