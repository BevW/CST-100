package topic03.chapter18;
import java.util.Scanner;
public class E17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a list of characters and a single character seperated by a space (eg: asdf f): ");
		String letters = input.next();
		char ch = input.next().charAt(0);
		
		//found line 14 online on a tutorial
		char[] chars = letters.replaceAll(" ", " ").toCharArray();
		
		System.out.println("The number of occurances is " + count(chars, ch));
		
		input.close();
	}
	//methods to find the number of occurances in an array
	public static int count(char[] chars, char ch){
		return count(chars, ch, chars.length - 1);
	}
	
	public static int count(char[] chars, char ch, int high){
		int count = (chars[high] == ch) ? 1 : 0;
		
		 if (high == 0)
			return count;
		else 
			return count + count(chars, ch, high - 1);
	}
}