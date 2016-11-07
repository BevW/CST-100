package topic03.chapter18;
import java.util.Scanner;
public class E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String value = input.next();
		
		input.close();
		
		reverseDisplay(value);
	}
	//method to reverse the display
	public static void reverseDisplay(String value){
		if (value.length() == 1)
			System.out.print(value);
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0,value.length() - 1));
		}
	}
}