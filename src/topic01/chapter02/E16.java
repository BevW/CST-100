package topic01.chapter02;
import java.util.Scanner;
public class E16 {
//Find the area of a hexagon
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double s = input.nextDouble();
		
		// Apply equation
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(s, 2);
		
		// Display area
		System.out.println("The area of the hexagon is " + area);
		
		input.close();
	}

}
