package topic02.chapter03;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		int digitone = number / 100;
		int digitthree = number % 10;
		
		System.out.println(digitone == digitthree 
				? (number + " is a palindrome."): 
				(number + " is not a palindrome"));
		input.close();
	}

}

