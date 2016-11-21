package topic04.chapter05;

public class E20 {
/*
(Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
per line. Numbers are separated by exactly one space.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To keep track of prime numbers
		int prime = 0;
		int number = 2;
		
		// Find prime numbers
		while (number <= 1000){
			// Use to check if number is prime
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++){
				if (number % divisor == 0){
					isPrime = false; 
					break; // Exit this for loop and check next
				}
			}
			if (isPrime){
				prime++; // increase count and then display
				
				if (prime % 8 == 0)
					System.out.println(number);
				else
					System.out.print(number + " ");	
			}
			number++;
		}
	}

}
