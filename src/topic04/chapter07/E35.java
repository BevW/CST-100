package topic04.chapter07;
import java.util.Scanner;
public class E35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array of words
		String[] words = {"bob"};
		
		//select a random index/word form words array
		String randomWord = words[(int) (Math.random() * words.length)];
		
		//display asterisks to hide the word from words array
		StringBuilder hiddenWord = new StringBuilder(randomWord.length());{
		for (int i = 0; i < randomWord.length(); i++)
			hiddenWord.append("*");
		}
		
		//count wrong guesses
		int wrongGuess = 0;
		
		//change random word to char array
		char[] randomWordCharArr = randomWord.toCharArray();
		
		//scanner object
		Scanner input = new Scanner(System.in);
		
		//length of word
		int lengthOfRandomWord = randomWord.length();{
		
		//display/get input/and give results
		while (lengthOfRandomWord >= 0){
			System.out.print("(Guess) Enter a letter you think is in the word: " + hiddenWord.toString() +
					" >");
			char guessedLetter = input.next().toCharArray()[0];
			
			for (int i = 0; i < randomWordCharArr.length; i++){
				if (guessedLetter == randomWordCharArr[i])
					hiddenWord.setCharAt(i, guessedLetter);
				if (!isAlreadyInWord (hiddenWord, guessedLetter))	
					if (guessedLetter != randomWordCharArr[1]){
						System.out.println(guessedLetter + " is not in the word.");
						wrongGuess++;
					}
			}
		}
		System.out.println("The word is " + randomWord + ". You missed " + wrongGuess + " time.");
	}
	}
	
	public static boolean isAlreadyInWord (StringBuilder hiddenWord, char guessedLetter){
		for (int i = 0; i < hiddenWord.charAt(i); i++){
			if (guessedLetter == hiddenWord.charAt(i))
				return true;
		}
		return false;
	}
}

