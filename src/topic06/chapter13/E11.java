package topic06.chapter13;

public class E11 {
/*
(The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable interfaces.
Assume that all eight sides of the octagon are of equal length. The area can
be computed using the following formula:
area = (2 + 4/22)* side * side
Draw the UML diagram that involves Octagon, GeometricObject,
Comparable, and Cloneable. Write a test program that creates an Octagon
object with side value 5 and displays its area and perimeter. Create a new object
using the clone method and compare the two objects using the compareTo
method.
 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// Object with side = 5
		Octagon octagon = new Octagon(5);
		
		// Sets side
		octagon.setSide(5);
		
		// Gets area and perimeter and displays it
		System.out.println("The area of the 1st octagon is " + octagon.getArea() + 
				" and the perimter is " + octagon.getPerimeter());
		
		// New object using the clone method
		Octagon octagon1 = (Octagon)octagon.clone();
		int compare = (octagon.compareTo(octagon1));
		if (compare > 0)
			System.out.println("Octagon is greater than Octagon1.");
		else if (compare == 0)
			System.out.println("Octagon is the same as Octagon1.");
		else
			System.out.println("Octagon is smaller than Octagon1.");
	}

}
