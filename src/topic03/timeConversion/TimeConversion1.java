package topic03.timeConversion;

import java.util.Scanner;

public class TimeConversion1 {

	public static void main(String[] args) {
		//Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time (eg. 1 30 24 AM): ");
		int hour = input.nextInt();
		int minute = input.nextInt();
		int seconds = input.nextInt();
		String ampm = input.next();
		
		//make sure user does not enter invalid input
		if ((hour > 0 && hour <= 12) && (minute >= 0 && minute < 60) && (seconds >= 0 && seconds < 60) && (ampm.equals("AM") || ampm.equals("PM"))){
			//differenciate between am and pm
			if (ampm.equals("PM"))
				hour += 12;
			 System.out.println(toMilitary(hour, minute, seconds, ampm));
		}
		else
			System.out.println("Invalid Entry");
		
		input.close();
	}
		//convert time
		public static String toMilitary(int hour, int minute, int seconds, String ampm) {
				return String.format("%02d:%02d:%02d", hour, minute, seconds);
		}
}
