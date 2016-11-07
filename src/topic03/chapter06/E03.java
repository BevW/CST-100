package topic03.chapter06;

import java.util.Scanner;

public class E03 {

	public static void main(String[] args) {

		//get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();	
		
		System.out.println(reverse(number) + " is the number in reverse.");
		System.out.println("It" + (isPalindrome(number) ? " is " : " is not ") +
				"a palindrome.");
		input.close();
	}
		
	//method
		public static boolean isPalindrome(int number){
			return number == reverse(number) ? true : false;
		}
		
		public static int reverse (int number) {
			String reverse = "";// holder
			String n = number + "";
			for (int i = n.length() - 1; i >= 0; i--)
				reverse += n.charAt(i);
		
		return Integer.parseInt(reverse);
		
	}
		
}

