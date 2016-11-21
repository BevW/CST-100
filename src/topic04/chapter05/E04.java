package topic04.chapter05;

public class E04 {
// Converts miles to kilometers and displays as a table
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a constant
		final double KILOMETERS_PER_MILE = 1.609;
		
		//Create table header
		System.out.printf("Miles\tKilometers\n");
		
		// Create loop that calculates and displays
		for (int miles = 1; miles <= 10; miles++){
			System.out.printf("%-8d%-5.3f\n", miles, (miles * KILOMETERS_PER_MILE));
		}
		
	}

}
