package topic01.chapter02;

import java.util.Scanner;

public class E04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in pounds: " );
		double pounds = input.nextDouble();
		double kilograms = pounds * 0.454;
		System.out.print( pounds + " pounds is " + kilograms + "kilograms");
		input.close();
	}

}