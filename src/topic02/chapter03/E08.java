package topic02.chapter03;
import java.util.Scanner;
public class E08 {
// Sort three integers in increasing order
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int one = input.nextInt();
		int two = input.nextInt();
		int three = input.nextInt();
		
		//Place in order
		int temp; // to allow me to switch number places
		if (two < one || three < two){
			if (two < one){
				temp = one;
				one = two;
				two = temp;
			}
			if (three < one){
				temp = one;
				one = three;
				three = temp;
			}
		}
		if (three < two){
			temp = two;
			two = three;
			three = temp;
		}
		
		// Display numbers
		System.out.println("The numbers in accending order are " + one + " " + two + " " + three);
		
		input.close();
	}
}
