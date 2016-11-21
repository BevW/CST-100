package topic01.chapter02;

import java.util.Scanner;

public class E02 {
		//compute the volume of a cylinder
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				//get input from user
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the radius and length of a cylinder: ");
				double radius = input.nextDouble();
				double length = input.nextDouble();
				
				//compute the area
				double area = radius * radius * Math.PI;
				//compute the volume
				double volume = area * length;
				
				//display results
				System.out.println("The area is " + area);
				System.out.println("The volume is " + volume);
				
				input.close();
			}
}
