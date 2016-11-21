package topic01.chapter04;

public class E16 {
// Displays a random uppercase character
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get random number between 65 and 90
		// Because the is the range for uppercase letters
		
		int number = 65 + (int)(Math.random() * (91 - 65));
		
		// Display random letter
		System.out.println("The character is " + (char)(number));
	}

}
