package topic02.chapter03;

import java.util.Scanner;

public class E18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sum of three numbers
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + 
				" is " + (number1 + number2 + number3 == answer));
		input.close();
	}

}