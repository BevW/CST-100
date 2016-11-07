package topic03.chapter18;
import java.util.Scanner;
public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Fib index: ");
		int fib = input.nextInt();
		
		System.out.println("Fib number is: " + fib(fib) );
		
		input.close();
		//Given by book
	
	}
	//Method to find Fib number
		
	
	public static long fib(long index){
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
		
		if (index == 0)
			return f0;
		else if (index == 1)
			return f1;
		
		for (int i = 1; i < index; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		return currentFib;
	}

}
