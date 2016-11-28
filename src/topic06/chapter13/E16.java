package topic06.chapter13;

public class E16 {
/*
(Create a rational-number calculator) Write a program similar to Listing 7.9,
Calculator.java. Instead of using integers, use rationals, as shown in Figure 13.10a.
You will need to use the split method in the String class, introduced in
Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator string and
denominator string, and convert strings into integers using the Integer.parseInt
method.
 */
	
// Got help online
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Checked number of strings passed
		if (args.length != 1){
			System.out.println("Usage: java Caclulator operand1 operator operand2");
			System.exit(0);
		}
		// Create string
		String result = args[0];
		
		// Split string
		String[] str = (args[0].replaceAll(" ", "/")).split("/");
		
		//Objects
		Rational r1 = new Rational(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		Rational r2 = new Rational(Integer.parseInt(str[3]), Integer.parseInt(str[4]));
		
		
		
		// Determine the operator
		switch (args[2].charAt(0)){
			case '+': result += " = " + r1.add(r2);
			break;
			case '-': result += " = " + r1.subtract(r2);
			break;
			case '.': result += " = " + r1.multiply(r2);
			break;
			case '/': result += " = " + r1.divide(r2);
			default: System.out.println("Invalid input. Use +, -, ., or /");
				System.exit(0);
		}
		// Display result
		System.out.println(result);
	}

}
class Rational extends Number implements Comparable<Rational> {
// Lines 54 to 57 were auto generated. I do not know why we need 54 to 56
// or what 57 is for.
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	// Date field
	private double[] r = new double[2];
	
	// No args constructor
	public Rational(){
		this(0, 1);
	}
	// Constructor
	public Rational (double numerator, double denominator){
		double gcd = gcd(numerator, denominator);
		r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		r[1] = Math.abs(denominator) / gcd;
	}
	// Find GCD: got from previous exercise
	private static double gcd(double n, double d){
		double n1 = Math.abs(n);
		double n2 = Math.abs(d);
		int gcd = 1;
		
		for (int i = 1; i <= n1 && i <= n2; i++){
			if (n1 % i == 0 && n2 % i == 0)
				gcd = i;
		}
		return gcd;
	}
	
	// Separate numerator and denominator
	public double getNumerator(){
		return r[0];
	}
	public double getDenominator(){
		return r[1];
	}
	
	// Instead of switch use separate methods
	// To add cross multiply then multiply bottoms
	public Rational add(Rational r1){
		double n = r[0] * r1.getDenominator() + r[1] * r1.getNumerator();
		double d = r[1] * getDenominator();
		return new Rational(n, d);
	}
	// Same as add but subtract
	public Rational subtract(Rational r1){
		double n = r[0] * r1.getDenominator() - r[1] * r1.getNumerator();
		double d = r[1] * getDenominator();
		return new Rational(n, d);
	}
	// To multiply just multiply across
	public Rational multiply(Rational r1){
		double n = r[0] * r1.getNumerator();
		double d = r[1] * r1.getDenominator();
		return new Rational (n, d);
	}
	// To divide flip r1 and multiply
	public Rational divide(Rational r1){
		double n = r[0] * r1.getDenominator();
		double d = r[1] * r1.getNumerator();
		return new Rational (n, d);
	}
	
	// Methods required to have
	
	@Override
	public String toString(){
		if (r[1] == 1)
			return r[0] + "";
		else 
			return r[0] + "/" + r[1];
	}
	@Override
	public boolean equals(Object o) {
		if((this.subtract((Rational)(o))).getDenominator() == 0)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() == 0)
			return 0;
		else
			return -1;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return r[0] * 1.0 / r[1];
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float)doubleValue();
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int)doubleValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)doubleValue();
	}
	
}
