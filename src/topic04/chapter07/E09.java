/*(Find the smallest element) Write a method that finds the smallest element in an
array of double values using the following header:

public static double min(double[] array)

Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value. Here is a
sample run of the program:
 ******************************************************************************/
package topic04.chapter07;
import java.lang.reflect.Array;
import java.util.Scanner;
public class E09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create array to be used
		double[] array = new double [10];
		
		//Get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++){
			array[i] = input.nextDouble();
		
		}
		//display min
		System.out.print("The smallest number is: " + min(array));
	}
	//Method to find min 
	public static double min(double[] array){
		double min = array[0];
		//foreach loop
		for (double i: array)
			if (i < min) {
				min = i;
			}
		return min;
	}
}
