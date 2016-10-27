package topic02.chapter03;

import java.util.Scanner;

public class E26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int number = input.nextInt();
		
		//and statement
		if (number % 5 == 0 && number % 6 == 0)
			System.out.println("Is " + "divisible by 5 and 6? true");
		else 
			System.out.println("Is " + "divisible by 5 and 6? false");
		
		//or statement
		if (number % 5 == 0 || number % 6 == 0)
			System.out.println("Is " + "divisible by 5 and 6? true");
		else 
			System.out.println("Is " + "divisible by 5 and 6? false");
		
		//or but not both statement
		if (number % 5 == 0 ^ number % 6 == 0)
			System.out.println("Is " + "divisible by 5 and 6, but not both? true");
		else 
			System.out.println("Is " + "divisible by 5 and 6, but not both? false");
		
		input.close();

	}

}
