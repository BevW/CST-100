package topic04.chapter05;
import java.util.Scanner;
public class E14 {
/*(Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd. */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two positive integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		// Follow directions above
		int gcd = 0;
		int d = 0;
		if (n1 < n2)
			d = n1;
		else
			d = n2;
		if (n1 % d == 0 && n2 % d == 0){
			gcd = d;
		}
		else if (n1 % d - 1 == 0 && n2 % d - 1 == 0){
			gcd = d - 1;
		}
		
		else if (n1 % d - 2 == 0 && n2 % d - 2 == 0){
			gcd = d - 2;
		}
		else if (n1 % 2 == 0 && n2 % 2 == 0){
			gcd = 2;
		}
		else
			gcd = 1;
		
		// Display
		System.out.println("The gcd is " + gcd);
		
		input.close();
	}

}
