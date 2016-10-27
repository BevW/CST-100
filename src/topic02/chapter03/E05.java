package topic02.chapter03;

import java.util.Scanner;

public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int day = input.nextInt();
		
		String today = "Sunday";
		if (day == 0)
				today = "Sunday";
		else if (day == 1)
			today = "Monday";
		else if (day == 2)
			today = "Tuesday";
		else if (day == 3)
			today = "Wednesday";
		else if (day == 4)
			today = "Thursday";
		else if (day == 5)
			today = "Friday";
		else if (day == 6)
			today = "Saturday";
		
		System.out.print("Enter the number of days elapsed since today ");
		int dayselapsed = input.nextInt();
		
		int futureday = (dayselapsed + day) % 7;
		String days = "Sunday";
		
		if (futureday == 0)
			days = "Sunday";
		else if (futureday == 1)
			days = "Monday";
		else if (futureday == 2)
			days = "Tuesday";
		else if (futureday == 3)
			days = "Wednesday";
		else if (futureday == 4)
			days = "Thursday";
		else if (futureday == 5)
			days = "Friday";
		else if (futureday == 6)
			days = "Saturday";
		
		System.out.println("Today is " + today + " and the future day is " + days);
		input.close();
	}

}

