package topic01.chapter02;

import java.util.Scanner;

public class E03 {
	//convert feet into meters
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//create scanner object
			Scanner input = new Scanner(System.in);
			
			//get user input
			System.out.print("Enter a value for feet: ");
			double feet = input.nextDouble();
			
			//calculate meters
			double meters = feet * .305;
			
			//display results
			System.out.println(feet + " feet is " + meters + " meters");
			
			input.close();
		}

}
