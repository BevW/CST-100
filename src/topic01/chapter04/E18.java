package topic01.chapter04;
import java.util.Scanner;
public class E18 {
// Gets the major and status from user and display it
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.printf("M: Mathematics\t\t\t1: Freshman\nC: Computer Science\t\t2: Sophmore\n" + 
				"I: Information Technology\t3: Junior\n\t\t\t\t4: Senior\n");
		System.out.print("Enter two characters: ");
		String str = input.next();
		
		// Isolate characters
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		// Use if-else and switch statement to assign class
		switch(ch1){
			case 'M': System.out.print("Mathematics"); break;
			case 'C': System.out.print("Computer Science"); break;
			case 'I': System.out.print("Information Technology"); break;
			default: System.out.println(ch1 + " is not a class");
				System.exit(1);
			}
		
		// Print a space between words
		System.out.print(" ");
		
		// Switch statement to assign grade
		switch(ch2){
			case '1': System.out.print("Freshman"); break;
			case '2': System.out.print("Sophmore"); break;
			case '3': System.out.print("Junior"); break;
			case '4': System.out.print("Senior"); break;
			default: System.out.print(" is the class, but " + ch2 + " is not a grade.");
			}
		
		input.close();
	}
}
