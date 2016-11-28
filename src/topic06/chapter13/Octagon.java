package topic06.chapter13;
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
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	
	// Data fields
	private double side;
	
	// No args constructor
	public Octagon(){
	}
	
	// Constructor for side
	public Octagon(double side){
		this.side = side;
	}

	// Getter
	public double getSide(){
		return side;
	}
	// Setter
	public void setSide(double side){
		this.side = side;
	}
	
	// Must be overrode
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() == o.getArea())
			return 0;
		else
			return -1;
	}

	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return side * 8;
	}
	
	// Didn't auto generate but need
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
