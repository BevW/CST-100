package topic03.timeConversion;

import java.util.Scanner;

public class TimeConversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time in 24 hour format (eg. 14 23 09): ");
		int hour = input.nextInt();
		int minute = input.nextInt();
		int seconds = input.nextInt();
		
		//make sure user does not enter invalid input
		if ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (seconds >= 0 && seconds < 60))
			System.out.println("The time is " + toRegular(hour, minute, seconds));
		else
				System.out.println("Invalid Entry");
		
		input.close();
	}	

		//convert time
		public static String toRegular(int hour, int minute, int seconds){
			return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour%12), minute, seconds, (hour < 12 ? "AM" : "PM"));
		}
}
