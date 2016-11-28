package topic04.chapter05;
import java.util.Scanner;
public class E22 {
/*
Write a program that lets the user enter the loan amount, number of years,
and interest rate and displays the amortization schedule for the loan.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner Object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of years: ");
		int numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		
		// Find # of payments and monthly interest
		int numberOfPayments = numberOfYears * 12;
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Find monthly payment, total payment and display it
		double monthlyPayment = loanAmount + monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfPayments;
		System.out.printf("Monthly Payment: %.2f\nTotal Payment: %.2f\n", monthlyPayment, totalPayment);
		
		// Table header
		System.out.println("Payment\tInterest\tPrincipal\tBalance");
		// Amortization schedule (circles and can't find solution)
		/*for (int payment = 1; payment <= numberOfPayments; payment++){
			double monthlyPrincipal;
			double monthlyInterest = monthlyPayment - monthlyPrincipal;
			if (payment == 1){
				remainingPrincipal = loanAmount;	
			}
			else{
				remainingPrincipal = principal - remainingPrincipal;
			}
			monthlyInterest = monthlyInterestRate * remainingPrincipal;
			// Display output
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", payment, monthlyInterest, principal, remainingPrincipal);
		}*/
		input.close();
	}

}
