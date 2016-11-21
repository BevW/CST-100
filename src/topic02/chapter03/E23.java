package topic02.chapter03;
import java.util.Scanner;
public class E23 {
// Check to see if the point is inside the rectangle
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Find the distance 
		double horizontalDistance = Math.sqrt(Math.pow(x2 - 0, 2));
		double verticalDistance = Math.sqrt(Math.pow(y2 - 0, 2));
		
		// Display if it is in the circle
		if (horizontalDistance <= 10 / 2 && verticalDistance <= 5 / 2)
			System.out.println("Point (" + x2 + ", " + y2 + ") is in the rectangle");
		else if (horizontalDistance > 10 / 2 || verticalDistance > 5 / 2)
			System.out.println("Point (" + x2 + ", " + y2 + ") is not in the rectangle");
		else
			System.out.println("Point (" + x2 + ", " + y2 + ")is invalid");
				
		input.close();
	}

}
