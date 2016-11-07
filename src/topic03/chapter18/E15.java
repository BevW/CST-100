/*Exercise 18.15 pg. 752
*(Occurrences of a specified character in a string) Rewrite Programming Exercise
*18.10 using a helper method to pass the substring high index to the method.
*The helper method header is:
*public static int count(String str, char a, int high)
*/
package topic03.chapter18;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String str = input.next();
		System.out.print("Enter the letter you want to know the occurances of: ");
		char a = input.next().charAt(0);

		System.out.println("The number of occurances of " + a + " in the word " + str +
				" is " + count(str, a, str.length() - 1));
		
		input.close();
	}
	//method to get occurances: using int high
	public static int count(String str, char a){
		return count(str, a, str.length() - 1);
	}
		private static int count(String str, char a, int high){
		if (high < 0)
			return 0;
		else if (str.charAt(high) == a)
			return 1 + count(str, a, high - 1);
		else {
			return count(str, a, high - 1);
		}
	}
	
}
