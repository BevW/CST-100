package topic03.chapter06;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_OF_CHARS = 50;
		int numbersPerLine = 10;
		char ch1 = '1';
		char ch2 = 'Z';
		System.out.println("Random characters 1 to Z are:");
		//prints characters from 1 to z
		for (int i = 0; i < NUMBER_OF_CHARS; i++){
			char ch = printChars(ch1, ch2, numbersPerLine);
			if ((i + 1) % numbersPerLine == 0)
				System.out.println(ch);
			else
				System.out.print(ch + " ");
		}
	}
	public static char printChars(char ch1, char ch2, int numberPerLine){
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
}
