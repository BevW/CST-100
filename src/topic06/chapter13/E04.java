package topic06.chapter13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class E04 {
/*
(Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
a calendar for a specified month using the Calendar and GregorianCalendar
classes. Your program receives the month and year from the command line. For
example:
java Exercise13_04 5 2016
You also can run the program without the year. In this case, the year is the current
year. If you run the program without specifying a month and a year, the month is
the current month.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Looked up lines 20 - 24 because we have not learned this yet

		// Check java command line usage
		if (args.length != 2){
			System.out.println("Usage: Java E04 month year");
			System.exit(1);
		}
		// Calendar object
		Calendar calendar = new GregorianCalendar(Integer.valueOf(args[1]),
				Integer.valueOf(args[0]) - 1, 1);
		//Header
		header(calendar);
		
		// Print days used figure 13.3 and book author
		while (calendar.get(Calendar.DATE) < calendar.getActualMaximum(Calendar.DATE)){
			if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
				System.out.printf("%4d\n", calendar.get(Calendar.DATE));
			else
				System.out.printf("%4d", calendar.get(Calendar.DATE));
			
			calendar.add(Calendar.DATE, 1);
		}
		System.out.printf("%4d\n", calendar.get(Calendar.DATE));
		
		// Days
		String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday", "Sunday"};
	}
	// get the month
	public static String[] getMonths(){
			String [] month = {"January", "February", "March", "April", "May", "June", "July",
					"August", "September", "October", "November", "December"};
			return month;
		}
	// Header
	public static void header(Calendar calendar){
		// Print month
		String [] month = getMonths();
		
		int length = 29 / 2 - (month[calendar.get(Calendar.MONTH)].length() / 2 + 3);
		System.out.println();
		for (int i = 0; i < length; i++)
			System.out.print(" ");
		System.out.println(month[calendar.get(Calendar.MONTH)] + ", " +
			calendar.get(Calendar.YEAR));
		// Print days
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}
}