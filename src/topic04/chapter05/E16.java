package topic04.chapter05;
import java.util.Scanner;
public class E16 {
/*
(Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in increasing order. For example, if the input integer is
120, the output should be as follows: 2, 2, 2, 3, 5.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int number1 = 2; 
		
		while (number / number1 != 1){

			if(number % number1 == 0){
				System.out.print(number1 + ", ");
				number /= number1;
			}
			else
				number1++;
		}
		System.out.print(number + ".");
		input.close();
	}
	
}
