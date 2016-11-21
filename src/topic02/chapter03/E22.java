package topic02.chapter03;
import java.util.Scanner;
public class E22 {
// Check to see if the point is inside the circle
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Find the distance to 0, 0
		double distance = Math.sqrt(Math.pow(x2 - 0, 2) + Math.pow(y2 - 0, 2));
		
		// Display if it is in the circle
		if (distance <= 10)
			System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
		else if (distance > 10)
			System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
		else
			System.out.println("Point (" + x2 + ", " + y2 + ")is invalid");
		
		input.close();
	}

}
