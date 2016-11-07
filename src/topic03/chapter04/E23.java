package topic03.chapter04;
import java.util.Scanner;
public class E23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Get payroll information
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
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
		System.out.printf(
				"Employee Name: " + name +
				"\nHours Worked: " + hours +
				"\nPay Rate: $" + pay + 
				"\nGross Pay: $" + grosspay + 
				"\nDeductinos: \n  Federal Withholding (" + federaltax * 100 +
				"): $" + federalWithholding +
				"\n  Federal Withholding (" + statetax * 100 +
				"): $" + stateWithholding +
				"\n  Total Deductions: $" + totalDeductions + 
				"\n Net Pay: $" + netPay);
		input.close();
	}

}
