package topic01.chapter02;
import java.util.Scanner;
public class E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		// Apply equation to get acceleration
		double acceleration = (v1 - v0) / t;
		
		// Display output
		System.out.println("The average ecceleration is " + acceleration);
		
		input.close();
	}

}
