/*
(Occurrences of a specified character in a string) Write a recursive method that
finds the number of occurrences of a specified letter in a string using the following
method header:

public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string and a character, and displays the number of
occurrences for the character in the string.
 */

package topic03.chapter18;
import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = input.next();
		System.out.print("Enter the letter you want to know the occurances of: ");
		char a = input.next().charAt(0);

		System.out.println("The number of occurances of " + a + " in the word " + str +
				" is " + count(str, a));
		
		input.close();
	}

	//method to count the occurances
	public static int count(String str, char a){
		int occurances = (a == str.charAt(0)) ? 1 : 0;
		if (str.length() == 1)
			return occurances;
		else {
			return occurances + count(str.substring(1), a);
		}
		
	}
}
