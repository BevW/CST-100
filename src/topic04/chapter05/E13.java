package topic04.chapter05;

public class E13 {
// Finds the largest n^3 that is less than 12000
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		while (Math.pow(n, 3) < 12000){
			n++;
			if (Math.pow(n, 3) > 12000)
				break;
		}
		
		System.out.println("The largest integer cubed that is less 12,000 is " +
				(n - 1) + ". It's total is " + Math.pow(n - 1,3));
	}

}
