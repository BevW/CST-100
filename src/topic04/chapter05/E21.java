package topic04.chapter05;
import java.util.Scanner;
public class E21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		//Prevent leaks
		input.close();
		
		//Header
		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
	//Calculate Payment
		// Obtain monthly interest rate
		
		double monthlyPayment = 0;
		for (double interestRate = 5; interestRate <= 8; interestRate += .125) {
			double monthlyInterestRate = interestRate / 1200;
			monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 /
				Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double totalPayment = monthlyPayment * numberOfYears * 12;
	//Create Table
		System.out.printf("%5.3f\t\t%.2f\t\t%.2f\n", interestRate, monthlyPayment,
				totalPayment);			
		}
	
	}
}
