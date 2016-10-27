package topic01.chapter01;

public class E11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercise 1.11
		//Seconds Per Year
		double seconds = 365 * 24 * 60 * 60; 
		//Births Per Year
		double births = (seconds / 7);
		//Deaths Per Year
		double deaths = (seconds / 13);
		//Immigrants Per Year
		double immigrants = (seconds / 45);
		double year1 = 312032486 + births + deaths + immigrants;
		double year2 = year1 + births - deaths + immigrants;
		double year3 = year2 + births - deaths + immigrants;
		double year4 = year3 + births - deaths + immigrants;
		double year5 = year4 + births - deaths + immigrants;
		System.out.println("Year 1 Population: " + (int) year1);
		System.out.println("Year 2 Population: " + (int) year2);
		System.out.println("Year 3 Population: " + (int) year3);
		System.out.println("Year 4 Population: " + (int) year4);
		System.out.println("Year 5 Population: " + (int) year5);
	}
}
