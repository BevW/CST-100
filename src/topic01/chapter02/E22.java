package topic01.chapter02;
import java.util.Scanner;
public class E22 {
// Cost of driving
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		// Find the cost of the trip
		double cost = drivingDistance / milesPerGallon * pricePerGallon;
		
		// Display cost
		System.out.printf("The cost of driving is $%.2f", cost);
		
		input.close();
	}

}
