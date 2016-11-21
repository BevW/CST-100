package topic01.chapter02;

import java.util.Scanner;

public class E01 {
//convert celsius to fahrenheit
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//get input
			Scanner input = new Scanner (System.in);
			System.out.print("Enter a degree in Celsius: ");
			double celsius = input.nextDouble();
			
			//convert celsius to fahrenheit
			double fahrenheit = (9.0 / 5) * celsius + 32;
			System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
			
			input.close();
	}

}
