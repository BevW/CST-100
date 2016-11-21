package topic02.chapter03;
import java.util.Scanner;
public class E21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month: 1-12: " );
		int m = input.nextInt();
		System.out.print("Enter the day of the month: ");
		int q = input.nextInt();
		
		//January is 13 and February is 15
		if (m == 1 || m == 2){
			m = (m == 1) ? 13 : 14;
			year--;
		}
		
		// Get rest of the variables ready needed for equation
		int j = year / 100;
		int k = year % 100;
		
		// Calculate h using given equation
		int h = (q + (26 * (m + 1)) / 10 + k + (k / 4) + (j / 4) + 5 * j) % 7;
		
		// Create a case that displays the results
		switch (h){
			case 0: System.out.println("Day of the week is Saturday");
			break;
			case 1: System.out.println("Day of the week is Sunday");
			break;
			case 2: System.out.println("Day of the week is Monday");
			break;
			case 3: System.out.println("Day of the week is Tuesday");
			break;
			case 4: System.out.println("Day of the week is Wednesday");
			break;
			case 5: System.out.println("Day of the week is Thursday");
			break;
			case 6: System.out.println("Day of the week is Friday");
			break;
		}
		
		input.close();
	}

}
