package topic04.chapter07;
import java.util.Scanner;
public class Trial {

	//array of words
	String[] words = {"house", "table", "car", "chair", "couch", "fridge"};
			
	//select a random index/word form words array
	String randomWord = words[(int) (Math.random() * words.length)];
	
	//display asterisks to hide the word from words array
	StringBuilder hiddenWord = new StringBuilder(randomWord.length());{
	for (int i = 0; i < randomWord.length(); i++)
		hiddenWord.append("*");
	}
	
	//change random word to char array
	char[] randomWordCharArr = randomWord.toCharArray();
	
	//scanner object
	Scanner input = new Scanner(System.in);
	
	//length of word
	int lengthOfRandomWord = randomWord.length();{
	
	//display/get input/and give results
	while (lengthOfRandomWord >= 0){
		System.out.println("(Guess) Enter a letter you think is in the word: " + hiddenWord.toString() +
				" >");
		char guessedLetter = input.next().toCharArray()[0];
		for (int i = 0; i < randomWordCharArr.length; i++){
			if(guessedLetter == randomWordCharArr[i])
				hiddenWord.setCharAt(i,guessedLetter);
		}
	}
}
}