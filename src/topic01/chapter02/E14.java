package topic01.chapter02;
import java.util.Scanner;
public class E14 {
//Calculate BMI
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches = input.nextDouble();
		
		// Convert pounds to kilograms
		double kilograms = pounds * .45359237;
		
		// Convert inches to meters
		double meters = inches* .0254;
		
		// Calculate BMI
		double bmi = kilograms / Math.pow(meters, 2);
		
		// Display output
		System.out.println("BMI is " + bmi);
		
		input.close();
	}

}
