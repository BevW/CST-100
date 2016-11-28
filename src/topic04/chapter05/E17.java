package topic04.chapter05;
import java.util.Scanner;
public class E17 {
/*
Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid,
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter and integer: ");
		int rows = input.nextInt();
		
		// Create pyramid
		for (int rows1 = 1; rows1 <= rows; rows1++){
			for (int space = rows - rows1; space >= 1; space--)
				System.out.print("  ");
			for (int decending = rows1; decending >=2; decending--)
				System.out.print(decending + " ");
			for (int ascending = 1; ascending <= rows1; ascending++)
				System.out.print(ascending + " ");
			System.out.println();
		}
	input.close();
	}
}
