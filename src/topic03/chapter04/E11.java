package topic03.chapter04;
import java.util.Scanner;
public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int value = input.nextInt();
		
		//convert decimal to hex
		if (value >= 0 && value <= 9)
			System.out.println("The hex value is " + value);
		else if (value >= 10 && value <= 15)	
			System.out.println("The hex value is " + (char)(value + 'A' - 10));
		else
			System.out.println(value + " is an invalid input");
		input.close();
	}

}
