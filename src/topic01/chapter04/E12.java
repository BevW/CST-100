package topic01.chapter04;
import java.util.Scanner;
public class E12 {
// Recieves a hex digit and displays a binary
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the hex digit: ");
		String str = input.next();
		
		// Check for exactly one character (from book)
		if (str.length() != 1){
			System.out.println("You must enter exactly one character.");
			System.exit(1);
		}
		
		// Find and display binary number
		char hex = str.charAt(0);
		if ((hex >= 'A' && hex <= 'F') || hex >= 0 && hex <= 9){
			System.out.print("The binary value is ");
			// Use switch statement
			switch (hex){
				case 0: System.out.println(0000); break; 
				case 1: System.out.println(0001); break; 
				case 2: System.out.println(0010); break; 
				case 3: System.out.println(0011); break; 
				case 4: System.out.println(0100); break; 
				case 5: System.out.println(0101); break; 
				case 6: System.out.println(0110); break; 
				case 7: System.out.println(0111); break; 
				case 8: System.out.println(1000); break; 
				case 9: System.out.println(1001); break; 
				case 'A': System.out.println(1010); break; 
				case 'B': System.out.println(1011); break; 
				case 'C': System.out.println(1100); break; 
				case 'D': System.out.println(1101); break; 
				case 'E': System.out.println(1110); break; 
				case 'F': System.out.println(1111); break;
			}
		}
		else
			System.out.println(hex + " is invalid.");
		
		input.close();
	}

}
