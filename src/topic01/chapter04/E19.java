package topic01.chapter04;
import java.util.Scanner;
public class E19 {
// Rewrote Exercise 3.9 but ISBN-10 as a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and get user input
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the first 9 digits of an ISVN as a integer: ");
				String isbn = input.next();
				
				
				//Isolate each number
				char d1 = isbn.charAt(0);
				char d2 = isbn.charAt(1);
				char d3 = isbn.charAt(2);
				char d4 = isbn.charAt(3);
				char d5 = isbn.charAt(4);
				char d6 = isbn.charAt(5);
				char d7 = isbn.charAt(6);
				char d8 = isbn.charAt(7);
				char d9 = isbn.charAt(8);
				
				// Calculate checksum
				int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
				
				// Display ISBN-10
				System.out.printf("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
				
				if (checkSum == 10)
					System.out.print("X");
				else
					System.out.print(checkSum);
				
				input.close();
	}

}
