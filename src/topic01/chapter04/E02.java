package topic01.chapter04;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double latitude1 = input.nextDouble();
		double longitude1 = input.nextDouble();
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double latitude2 = input.nextDouble();
		double longitude2 = input.nextDouble();
		//computing formula
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(Math.toRadians(latitude1)) *
				Math.sin(Math.toRadians(latitude2)) + 
				Math.cos(Math.toRadians(latitude1)) * 
				Math.cos(Math.toRadians(latitude2)) *
				Math.cos(Math.toRadians(longitude1 - longitude2)));
		System.out.println("The distance between the two points is " + d + "km");
		input.close();
	}

}