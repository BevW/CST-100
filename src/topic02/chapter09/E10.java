package topic02.chapter09;
import java.util.Scanner;
public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enters values for a, b, and c; ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		
		System.out.print("The equation has ");
		if (equation.getDiscriminant() < 0)
			System.out.print("no real roots.");
		else if (equation.getDiscriminant() == 0)
			System.out.print("one root " + (equation.getRoot1() > 0 ? equation.getRoot1() : equation.getRoot2()));
		else if (equation.getDiscriminant() > 0)
			System.out.print("two roots " + equation.getRoot1() + " , " + equation.getRoot2());	
		input.close();
	}
}


/*UML Diagram
 * -a: double
 * -b: double
 * -c: double
 * +QuadraticEquation(a:double, b:double, c:double)
 * +getA(): double
 * +getB(): double
 * +getC(): double
 * +getDiscriminant(): double
 * +getRoot1(): double
 * +getRoot2(): double
 */

class QuadraticEquation{
	
	//coefficients
	private double a;
	private double b;
	private double c;
	
	//constructor with args
	QuadraticEquation(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//getter methods
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	//return discriminant
	public double getDiscriminant(){
		return Math.pow(b, 2) - (4 * a * c);
	}
	//return root1
	public double getRoot1(){
		return getDiscriminant() < 0 ? 0:
			((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}
	//return root 2
	public double getRoot2(){
		return getDiscriminant() < 0 ? 0:
			((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	}
}
