package topic04.chapter05;
/*
(Demonstrate cancellation errors) A cancellation error occurs when you are
manipulating a very large number with a very small number. The large number
may cancel out the smaller number. For example, the result of 100000000.0 +
0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
more accurate results, carefully select the order of computation. For example, in
computing the following series, you will obtain more accurate results by computing
from right to left rather than from left to right
Write a program that compares the results of the summation (in book)series, 
computing from left to right and from right to left with n = 50000.
 */
public class E23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Left to right
		double sum1 = 0.0;
		for (double i = 1; i <= 50000; i++){
			sum1 += (1/i);
		}
		System.out.println("From left to right the sum is: " + sum1);
// Right to left
		for (double i = 50000.0; i > 1.0; i--)
			sum1 += (1/i);
		System.out.println("Form right to left the sum is: " + sum1);
	}
}
