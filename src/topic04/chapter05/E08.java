package topic04.chapter05;
import java.util.Scanner;
public class E08 {
// Get the number of student, students name, and score
// Displays name of student with highest score
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		// Prep for loop
		double highScore = 0;
		int students = 1;
		String name = "";
		
		
		
		// Do while loop to find high score
		do {
			System.out.print("Enter the student's score: ");
			double score = input.nextDouble();
			System.out.print("Enter the first name of the student: ");
			String names = input.next();
			if (score >= highScore){
				highScore = score;
				name = names;
			}
			students++;
		}
		while (students <= numberOfStudents);
		
		// Display student with high score
		System.out.println(name + " had the high score of " + highScore);
		
		input.close();
	}

}
