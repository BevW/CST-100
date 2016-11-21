package topic01.chapter04;
import java.util.Scanner;
public class E24 {
// Displays Cities in ascending order (Alphabetical order)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner Object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 1st city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the 2nd city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the 3rd city: ");
		String city3 = input.nextLine();
		
		// compare and place cities in numerical order
		String temp; // to allow me to switch number places
		if ((city2.compareToIgnoreCase(city1) < 0) && (city2.compareToIgnoreCase(city3) < 0)){
			temp = city1;
			city1 = city2;
			city2 = temp;	
		}
		else if ((city3.compareToIgnoreCase(city1) < 0) && (city3.compareToIgnoreCase(city2) < 0)) {
			temp = city1;
			city1 = city3;
			city3 = temp;
		}
		if (city3.compareToIgnoreCase(city2) < 0) {
			temp = city2;
			city2 = city3;
			city3 = temp;
		}
		
		// Display cities
		System.out.println("The cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
		
		input.close();
	}

}
