package topic02.chapter03;

import java.util.Scanner;

public class E29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input for Circle 1
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cirle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		// Input for Circle 2
		System.out.print("Enter cirle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		// Calculation of distance between two centers
		
		double distance = Math.sqrt((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2)));
		
		if(distance <= Math.abs(radius1 - radius2))
			System.out.println("circle2 is inside circle1");
		else if(distance <= radius1 + radius2)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");
		input.close();
	}

}
