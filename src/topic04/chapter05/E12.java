package topic04.chapter05;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		while (Math.pow(n,2) < 12000){
			n++;
		}
		System.out.println("The smallest integer squared that is greater 12,000 is " +
				n + ". It's total is " + Math.pow(n,2));
			
	}

}
