package topic04.chapter05;

public class E06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create constants
		final double KILOMETERS_PER_MILE = 1.609;
				
				// Display table header
				System.out.println("Miles\tKilometers\t  |\tKilometers\tMiles");
					
				// Make a for loop that computes and displays
					for (int miles = 1, kilometers = 20; miles <= 10; miles++, kilometers = kilometers + 5){
						System.out.printf("%-8d%-8.3f\t  |\t%-14d%7.2f\n",
									miles, (miles * KILOMETERS_PER_MILE), kilometers, (kilometers / KILOMETERS_PER_MILE));
				}
	}

}
