package topic02.chapter03;
import java.util.Scanner;
public class E06 {
// Rewrite Lising 3.4 to get feet and inches to calculate BMI
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Scanner object and get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter wight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter feet: ");
		double feet = input.nextDouble();
		System.out.print("Enter inches: ");
		double inches = input.nextDouble();
		
		// Create constants for conversion
		final double KILOGRAMS_PER_POUND = .45359237;
		final double METERS_PER_INCH = .0254;
		
		// Convert feet and inches to inches
		double totalInches = (feet * 12) + inches;
		
		// Convert inches to metes and pounds to kilograms
		double kilograms = weight * KILOGRAMS_PER_POUND;
		double meters = totalInches * METERS_PER_INCH;
		double bmi = kilograms / Math.pow(meters, 2);
		
		// Create and else-if statement to display results
		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
		System.out.println("Underweight");
		else if (bmi < 25)
		System.out.println("Normal");
		else if (bmi < 30)
		System.out.println("Overweight");
		else
		System.out.println("Obese");
		
		input.close();
	}

}
