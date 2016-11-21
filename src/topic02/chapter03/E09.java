package topic02.chapter03;
import java.util.Scanner;
public class E09 {
// Check ISBN - 10:
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISVN as a integer: ");
		int isbn9 = input.nextInt();
		
		//Isolate each integer
		int d1 = isbn9 / 100000000;
		int remaining = isbn9 % 100000000;
		int d2 = remaining / 10000000;
		remaining %= 10000000;
		int d3 = remaining / 1000000;
		remaining %= 1000000;
		int d4 = remaining / 100000;
		remaining %= 100000;
		int d5 = remaining / 10000;
		remaining %= 10000;
		int d6 = remaining / 1000;
		remaining %= 1000;
		int d7 = remaining / 100;
		remaining %= 100;
		int d8 = remaining / 10;
		remaining %= 10;
		int d9 = remaining;
		
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
