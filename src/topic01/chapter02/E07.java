package topic01.chapter02;
import java.util.Scanner;
public class E07 {
//find the number of years
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//get input from user
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		//calculate years and days
		int hours = minutes / 60;
		int totalDays = hours / 24;
		int days = hours % 24;
		int years = totalDays / 365;
		
		//display results
		System.out.println(minutes + " minutes is apporximately " + years + " years and " +
				days + " days");
		
		input.close();
	}

}
