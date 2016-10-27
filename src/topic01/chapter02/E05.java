package topic01.chapter02;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityrate = input.nextDouble();
		double gratuity = (subtotal * gratuityrate) / 100;
		double total = subtotal + gratuity;
		System.out.println("The gratuity is $" + ((int) (gratuity * 100) / 100.0) + " and the total is $" + ((int) (total * 100) / 100.0));
		input.close();
	}

}