package topic01.chapter02;
import java.util.Scanner;
public class E13 {
//A program that finds the savings ofter six months
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a monthly saving amount: ");
		double savingAmount = input.nextDouble();
		
		//caclulate the saving afer six months
		double interestRate = 1 + .00417;
		double month1 = savingAmount * interestRate;
		double month2 = (savingAmount + month1) * interestRate;
		double month3 = (savingAmount + month2) * interestRate;
		double month4 = (savingAmount + month3) * interestRate;
		double month5 = (savingAmount + month4) * interestRate;
		double month6 = (savingAmount + month5) * interestRate;
		
		// Display month 6
		System.out.printf("After teh sixth month, the account value is $" + "%.2f", month6);
		
		input.close();
	}

}
