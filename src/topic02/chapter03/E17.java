package topic02.chapter03;

import java.util.Scanner;

public class E17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int choice = input.nextInt();
		if (choice > 2){
			System.out.println("Invalid Entry!");
			System.exit(1);
		}	
		int random = (int)(Math.random() * 3);
		String computer = null;	
		switch (random) {
			case 0: computer = "scissors"; break;
			case 1: computer = "rock"; break;
			case 2: computer = "paper"; break;
			}
		String person = null;
		switch (choice) {
		case 0: person = "scissors"; break;
		case 1: person = "rock"; break;
		case 2: person = "paper"; break;
		}
		
		if ((random - choice) == -1 || (random - choice) == 2)
			System.out.println("The computer is " + computer + ". You are " 
			+ person + ". You won");
		else if (random == choice)
			System.out.println("The computer is " + computer + ". You are " 
			+ person + ". It is a draw");
		else if ((random - choice) == -2 || (random - choice) == 1)
			System.out.println("The computer is " + computer + ". You are " 
			+ person + ". You lost");
		
		input.close();
			}
}
