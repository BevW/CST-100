/*(Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:

A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.

Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise. */
package topic03.chapter06;
import java.util.Scanner;
public class E18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get password
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password containing only letters and digits;"); 
		System.out.print("\t-At least 8 charaters \n\t-At least 2 digits \n\t");
		String password = input.next();
	
		//display
	if (validPassword(password)){
		System.out.println("Valid Password");
	}
	else
		System.out.println("Invalid Password");
	input.close();
	}
	//method checking for validity of password
	public static boolean validPassword(String password){
		if (password.length() < 8)
			return false;
		else {
			char c;
			int count = 0;
			for (int i = 0; i < password.length(); i++){
				c = password.charAt(i);
				if (!Character.isLetterOrDigit(c))
					return false;
				else if (Character.isDigit(c))
					count++;
			}
			if (count < 2)
				return false;
		}
		return true;
	}
	
}

