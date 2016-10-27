package topic01.chapter02;

import java.util.Scanner;

public class E23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.print("Enter the driving distance: ");
		double drivingdistance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milespergallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricepergallon = input.nextDouble();
		double costofdriving = (drivingdistance / milespergallon) * pricepergallon;
		System.out.print("The cost of driving is $" + (int)(costofdriving * 100) / 100.0);
		input.close();
	}

}