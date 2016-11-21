package topic01.chapter04;
import java.util.Scanner;
public class E14 {
// Conver a letter grade into a number that is displayed
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		char grade = input.next().charAt(0);
		
		// Use a switch statement to get desired output
		if (grade >= 'A' && grade <= 'F' && grade != 'E'){
			System.out.print("The numeric value for grade " + grade + " is ");
			switch (grade){
				case 'A': System.out.println("4"); break;
				case 'B': System.out.println("3"); break;
				case 'C': System.out.println("2"); break;
				case 'D': System.out.println("1"); break;
				case 'F': System.out.println("0"); break;
			} 
		}
		else
			System.out.println(grade + " is an invalid grade.");
		
		input.close();
	}

}
