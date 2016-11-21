package topic01.chapter02;
import java.util.Scanner;
public class E11 {
// Rewrite the programming Exercise 1.11 (population project)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner object and input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int numberOfYears= input.nextInt();

		//Seconds Per Year
		double seconds = 365 * 24 * 60 * 60; 
		//Births Per Year
		double births = (seconds / 7);
		//Deaths Per Year
		double deaths = (seconds / 13);
		//Immigrants Per Year
		double immigrants = (seconds / 45);
		
		//Calculate population
		int population = 312032486  + ((int)births - (int)deaths + (int)immigrants) * numberOfYears;
		
		//Display results
		System.out.println("The population in " + numberOfYears + " is " + population);
		
		input.close();
	}

}
