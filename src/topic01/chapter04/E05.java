package topic01.chapter04;
import java.util.Scanner;
public class E05 {
// Find the area of a polygon
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double n = input.nextDouble();
		System.out.print("Eneter the side length: ");
		double s = input.nextDouble();
		
		// Calculate area using the formula given in the book
		double area = n * Math.pow(s, 2) / (4 * Math.tan(Math.PI / n));
		
		// Display results
		System.out.println("the are of the polygon is " + area);
		
		input.close();
	}

}
