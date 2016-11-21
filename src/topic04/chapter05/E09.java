package topic04.chapter05;

import java.util.Scanner;

public class E09 {
// Get the number of student, students name, and score
// Displays names and scores of the student with highest and second highest score
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner object and user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		// Prep for loop
		double highScore = 0;
		double secondHighScore = 0;
		int students = 1;
		String name1 = "";
		String name2 = "";
		
		// Do while loop to find high score and second-high
		do {
			System.out.print("Enter the student's score: ");
			double score = input.nextDouble();
			System.out.print("Enter the first name of the student: ");
			String names = input.next();
			if (score >= highScore){
				highScore = score;
				name1 = names;
			}
			if (score >= secondHighScore && highScore != secondHighScore){
				secondHighScore = score;
				name2 = names;
			}
			students++;
		}
		while (students <= numberOfStudents);
		
		// Display student with high score and second-high
		System.out.println(name1 + " had the high score of " + highScore + "\n" +
				name2 + " had the second-high score of " + secondHighScore);
		
		input.close();
	}

}
