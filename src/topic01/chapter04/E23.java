package topic01.chapter04;
import java.util.Scanner;
public class E23 {
// Receives information and prints payroll statement
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
				
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
				
		System.out.print("Enter hourly pay rate: ");
		double pay = input.nextDouble();
				
		System.out.print("Enter federal tax withholding rate: ");
		double federaltax = input.nextDouble();
				
		System.out.print("Enter state tax withholding rate: ");
		double statetax = input.nextDouble();
				
		//space
		System.out.println();
				
		//preparation to display payroll
		double grosspay = hours * pay;
		double federalWithholding = grosspay * federaltax;
		double stateWithholding = grosspay * statetax;
		double totalDeductions = (federalWithholding + stateWithholding);
		double netPay = grosspay - totalDeductions;
				
		//display payroll statement
		System.out.printf("Employee Name: %s\nHours Worked: %2.1f\nPay Rate: $%.2f", name, hours, pay); 
		System.out.printf("\nGross Pay: $%.2f\nDeductions: \n", grosspay);
		System.out.print(" Federal Withholding (" + (federaltax * 100));
		System.out.printf("): $%.2f", federalWithholding);
		System.out.print("\n State Withholding (" + (statetax * 100));
		System.out.printf("): $%.2f", stateWithholding);
		System.out.printf("\n Total Deductions: $%.2f\nNet Pay: $%.2f", totalDeductions, netPay);
				
		input.close();
	}

}
