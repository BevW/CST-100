package topic04.chapter05;

public class E15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To keep track of characters
		int characters = 0;
		
		// Display ASCII
		for (int i = 33; i <= 126; i++){
			characters++;
			if (characters % 10 == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");
		}
	}
}

