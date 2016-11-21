package topic02.chapter03;
import java.util.Scanner;
public class E11 {
// Find the number of days in a month of any given year
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the month as an integer: ");
		int months = input.nextInt();
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		
		// Find out if it is a leap year (given in book)
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		// Use a switch statement to show number of days in each month
		switch (months){
		case 1: System.out.println("January " + year + " had 31 days");
				break;
		case 2: System.out.println("February " + year + " had" + ((isLeapYear) ? " 29 days" : " 28 days")); 
				break;
		case 3: System.out.println("March " + year + " had 31 days"); 
				break;
		case 4: System.out.println("April " + year + " had 30 days");
				break;
		case 5: System.out.println("May " + year + " had 31 days");
				break;
		case 6: System.out.println("June " + year + " had 30 days");
				break;
		case 7: System.out.println("July " + year + " had 31 days");
				break;
		case 8: System.out.println("August " + year + " had 31 days");
				break;
		case 9: System.out.println("September " + year + " had 30 days");
				break;
		case 10: System.out.println("October " + year + " had 31 days");
				break;
		case 11: System.out.println("November " + year + " had 30 days");
				break;
		case 12: System.out.println("December " + year + " had 31 days");
		}
		
		input.close();
	}

}
