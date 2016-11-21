package topic04.chapter05;

public class E07 {
// Find what the tuition will be after going to college for 
// four years, after the 10th year
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Prep for loop
		double tuition = 10000;
		double sum = 0;
		double eleven = 0;
		double ten = 0;
		
		// Create loop to get tuition
		for(int years = 1; years < 15; years++){
			tuition = (tuition * 1.05);
			if (years >= 10 && years <= 14)
				sum += tuition;
			if (years == 10)
				ten = tuition;
			if (years == 11)
				eleven = tuition;
		}
		// Display results
		System.out.printf(eleven + "In 10 years the tuition will be $%.2f\nThe cost of going to college ten years from now" 
				+ " for four years will cost $%.2f",ten, sum);
	}

}
