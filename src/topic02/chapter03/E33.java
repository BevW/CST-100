package topic02.chapter03;

import java.util.Scanner;

public class E33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input for package1
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		//input for package2
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		//calculate price per unit
		double priceperunit1 = price1 / weight1;
		double priceperunit2 = price2 / weight2;
		
		if(priceperunit1 > priceperunit2)
			System.out.println("Package 2 has a better price.");
		else if(priceperunit1 == priceperunit2)
			System.out.println("Two packages have the same price.");
		else
			System.out.println("Package 1 has a better price.");
		
		input.close();
	}

}
