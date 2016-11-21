package topic04.chapter05;

public class E03 {
// Displays a program that converts kilograms to pounds
// Goes from 1 to 199 and displays a table
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create constant
		final double POUNDS_PER_KILOGRAM = 2.2;
		
		// Display table header
		System.out.println("Kilograms    Pounds");
		
		// Make a for loop that computes and displays
		for (int kilograms = 1; kilograms < 200; kilograms++){
			System.out.printf("%-10d%6.1f\n", kilograms, (kilograms * POUNDS_PER_KILOGRAM));
		}
	}

}
