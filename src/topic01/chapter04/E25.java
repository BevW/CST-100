package topic01.chapter04;

public class E25 {
// Generate vehicle plate number 3 letters and 4 digits
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Get three uppercase letters 64-90
		int letter1 = 65 + (int)(Math.random() * (90 - 65));
		int letter2 = 65 + (int)(Math.random() * (90 - 65));
		int letter3 = 65 + (int)(Math.random() * (90 - 65));
		
		// Get three numbers 0-9
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random() * 10);
		
		// Make plate (Iowa plates have a space)
		System.out.println("The Iowa plate number is " + (char)letter1 + (char)letter2 + 
				(char)letter3 + " " + number1 + number2 + number3 + number4);

	}
}
