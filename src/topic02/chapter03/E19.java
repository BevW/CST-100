package topic02.chapter03;
import java.util.Scanner;
public class E19 {
// Compute the perimeter of a triangle, but display invalid with invalid input
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		// Create if statment to get the perimeter and reject invalid input
		double perimeter = side1 + side2 + side3;
		
		if ((side1 + side2 <= side3) || (side2 + side3 <= side1) || (side3 + side1 <= side2))
			System.out.println("The input is invalid");
		else
			System.out.println("The perimter of the triangle is: " + perimeter);
		
		input.close();
	}

}
