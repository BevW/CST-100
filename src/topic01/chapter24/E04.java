package topic01.chapter24;

import java.util.Stack;

public class E04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*All information was received from previous
		 * that were not assigned e.g. 3, 16
		 */
	    Stack<Integer> stack = new Stack<Integer>();

	    stack.push(null);
	    
	    final int NUMBER_OF_PRIMES = 50;
	    final int NUMBER_OF_PRIMES_PER_LINE = 5;
	    
	    int count = 0;
	    int number = 2;
	    
	    System.out.println("The first 50 primes are \n");

	    while(count < NUMBER_OF_PRIMES){
	        boolean isPrime = true;

	    for(int divisor = 2; divisor <= number/2; divisor++){
	        if(number % divisor == 0){
	            isPrime = false;
	            break;
	        }
	    }
	    if(isPrime){
	        count++;
	        
	        if(count % NUMBER_OF_PRIMES_PER_LINE ==0){
	            System.out.println(number);
	        }
	        else
	            System.out.print(number + " ");

	    }
	    number++;
	    }
	}
}
