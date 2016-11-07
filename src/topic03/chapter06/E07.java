package topic03.chapter06;
import java.util.Scanner;
public class E07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount (e.g., 1000) and interest rate (e.g., 9%): ");
		double investmentAmount = input.nextDouble();
		double interestRate = input.nextDouble();
		//# of years I want displayed
		int NUMBER_OF_YEARS = 30;
		
		//prevent leaking
		input.close();
		
		//formula calls for monthly interest rate
		double monthlyInterestRate = interestRate / 1200;
		//make table
		System.out.println("Year     Future Value");
		for (int years = 0; years <= NUMBER_OF_YEARS; years++){
			//to display year prevent crookedness at year 10
			System.out.printf("%-2d", years);
			//to display amount and give space between year and amount
			System.out.printf("%15.2f\n",
					futureInvestmentValue(investmentAmount,monthlyInterestRate,years));	
		}
	}
	public static double futureInvestmentValue(
			double investmentAmount, double monthlyInterestRate, int years){
		return investmentAmount * Math.pow((1 + monthlyInterestRate),(years * 12));
	}
}