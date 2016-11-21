package topic04.chapter05;

public class E11 {
// Display numbers that are divisible by 5 or 6; not both
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Allows us to print numbers
		int count = 0;

		// Numbers divisible by 5 and 6
		for (int i = 100; i <= 200; i++)
			if (i % 6 == 0 ^ i % 5 == 0){
				count++;
				// Display single # in count
				if (count % 10 == 0)
					System.out.println(i);
				else
					System.out.print(i + " ");
			}
	}

}
