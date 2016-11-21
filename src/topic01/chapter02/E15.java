package topic01.chapter02;
import java.util.Scanner;
public class E15 {
//Find the distanc between two points
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculate Distance
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		// Display output
		System.out.println("the distance between the two points is " + distance);
		
		input.close();
	}

}
