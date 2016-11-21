package topic01.chapter02;
import java.util.Scanner;
public class E06 {
//sum the digits in an integer
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//get input from user
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		//isolate each number
		int place100 = number / 100;
		int place100Remainder = number % 100;
		int place10 = place100Remainder / 10;
		int place10Remainder = place10 % 10;
		
		//add each number
		int sum = place100 + place10 + place10Remainder;
		
		//display output
		System.out.println("The sum of the digits is " + sum);
		
		input.close();
	}

}
