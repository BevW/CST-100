package topic04.chapter05;

public class E05 {
// Display exercises 5.4 and convert kilograms to pounds and display side by side
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create constants
		final double POUNDS_PER_KILOGRAM = 2.2;
		
		// Display table header
		System.out.println("Kilograms\tPounds\t  |\tPounds\tKilograms");
			
		// Make a for loop that computes and displays
			for (int kilograms = 1, pounds = 20; kilograms < 200; kilograms = kilograms + 2, pounds = pounds + 5){
				System.out.printf("%-15d%7.1f\t  |\t%-10d%7.2f\n",
							kilograms, (kilograms * POUNDS_PER_KILOGRAM), pounds, (pounds / POUNDS_PER_KILOGRAM));
			}
	}

}
