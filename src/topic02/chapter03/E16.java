package topic02.chapter03;

public class E16 {
// A program that displays a random coordinate in a rectangle
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Get two random points centered around zero with
		 * a width of 100 and height of 200 */
		double xPoint = (Math.random() * 100) - 50;
		double yPoint = (Math.random() * 200) - 100;
		
		System.out.printf("The coordinate in the rectangle is: " + xPoint +
				", " + yPoint);
	}

}
