package topic02.chapter03;
import java.util.Scanner;
public class E01 {
// Solve quadratic equation and tell the number of roots
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b , and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Solve Equations
		double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		
		// Make else-if statements for discriminant
		double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		if (discriminant > 0) {
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		else if (discriminant == 0){
			System.out.println("The equation has one root " + r1);
		}
		else{
			System.out.println("The equation has no real roots");
		}
		
		input.close();
	}

}
