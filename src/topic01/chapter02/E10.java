package topic01.chapter02;
import java.util.Scanner;
public class E10 {
//A program that calculates energy needed to heat water from initial temp to final temp
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and input form user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms ");
		double kilograms = input.nextDouble();
		System.out.print("Enter the intitial tmeperature: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double finalTemperature = input.nextDouble();
		System.out.println("Enter the final temperature: ");
		
		// Apply the equation
		double energy = kilograms * (finalTemperature - temperature) * 4184;
		
		// Display output
		System.out.println("The energy needed is " + energy);
		
		input.close();
	}

}
