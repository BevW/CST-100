package topic01.chapter02;
import java.util.Scanner;
public class E08 {
//Time zone swtich
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creat scanner object
		Scanner input = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter the time zond offset to GMT: ");
		int offset = input.nextInt();
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour and offset
		long currentHour = totalHours % 24;
		currentHour = currentHour + offset;
		
		// Display results
		System.out.println("Current time is " + currentHour + ":" +
				currentMinute + ":" + currentSecond + " GMT");
		
		input.close();
	}

}
