package topic03.chapter18;
import java.util.Scanner;
public class E25 {
	//watched a tutorial online to help find solution
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		System.out.print("Permutations of " + str + " are: \n");
		
		
		displayPermutation(str);
		
		input.close();
		
	}
	public static void displayPermutation(String str){
		displayPermutation("", str);
	}
	public static void displayPermutation(String s1, String s2) {
		if (s2.length() == 0)
			System.out.println(s1);
		else {
			for (int i = 0; i < s2.length(); i++) {
				displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
			}
		}
	}
}
