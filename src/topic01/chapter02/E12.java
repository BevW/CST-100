package topic01.chapter02;
import java.util.Scanner;
public class E12 {
// Finding runway length
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed adn acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		// Apply equation
		double length = Math.pow(v, 2) / (2 * a);
		
		//Display output
		System.out.println("The minimum runway length for this airplane is " + length);
		
		input.close();
	}

}
