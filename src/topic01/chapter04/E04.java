package topic01.chapter04;

import java.util.Scanner;

public class E04 {
// Compute area of a hexagon
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the length of a side: ");
				double s = input.nextDouble();
				
				// Calculate the area with given formula and user input
				double area = 6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 6));
				
				// Display area with 2 places after decimal
				System.out.printf("The area of the hexagon is %.2f", area);
				
				input.close();
	}

}
