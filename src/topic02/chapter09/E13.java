package topic02.chapter09;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting row and column
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and culumns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		//getting the array and create a matrix
		//we have not gone over this yet it is in chap 8
		//it is very complicated... there is a whole chapter on it
		double [][] array = new double [rows][columns];
		System.out.println("Enter the array: ");
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				array[i][j] = input.nextDouble();
			}

		}	
		input.close();
		
		Location max = locateLargest(array);
			
		System.out.println("The location of the largest element is " + max.maxValue +
				" at (" + max.row + ", " + max.column + ")");
		}
	public static Location locateLargest(double[][] a){
		return new Location(a);
	}
}

class Location{
	
	//data fields
	int row;
	int column;
	double maxValue;
			
	public Location(double [][] a) {

		//using pg 291 i is the row j is column
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				//get max instead of min
				if(a [i][j] > maxValue){
					maxValue = a [i][j];
					row = i;
					column = j;
				}
			}
		}
	}
}
