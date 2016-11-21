package topic01.chapter02;
import java.util.Scanner;
public class E21 {
// Calculate the future investment amount
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		// Find monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Apply given equation
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
		
		// Display future investment value
		System.out.printf("Accumulated value is $" + "%.2f", futureInvestmentValue);
		
		input.close();
	}

}
