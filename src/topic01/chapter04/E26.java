package topic01.chapter04;
import java.util.Scanner;
public class E26 {
// Rewrite Listing 2.10 to fix accuracy issues
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print(
		"Enter an amount in double, for example 11.56: ");
		String amount = input.nextLine();

		// Get dollars
		int numberOfDollars = Integer.parseInt(amount.substring(0, amount.indexOf('.')));
		
		// Get change
		int change = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

		// Find the number of quarters in the remaining amount
		int numberOfQuarters = change / 25;
		change = change % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = change / 10;
		change = change % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = change / 5;
		change = change % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = change;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		if (numberOfDollars == 1)
			System.out.println(" " + numberOfDollars + " dollar");
		else if (numberOfDollars > 1)
			System.out.println(" " + numberOfDollars + " dollars");
		if (numberOfQuarters == 1)
			System.out.println(" " + numberOfQuarters + " quarter ");
		else if (numberOfQuarters > 1)
			System.out.println(" " + numberOfQuarters + " quarters ");
		if (numberOfDimes == 1)
			System.out.println(" " + numberOfDimes + " dime");
		else if (numberOfDimes > 1)
			System.out.println(" " + numberOfDimes + " dimes");
		if (numberOfNickels == 1)
			System.out.println(" " + numberOfNickels + " nickel");
		else if (numberOfNickels > 1)
			System.out.println(" " + numberOfNickels + " nickels");
		if (numberOfPennies == 1)
			System.out.println(" " + numberOfPennies + " pennie");
		else if (numberOfPennies > 1)
			System.out.println(" " + numberOfPennies + " pennies");
		
		input.close();
	}
}
