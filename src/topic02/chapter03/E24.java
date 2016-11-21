package topic02.chapter03;

public class E24 {
// Pick a random card from a deck
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pick a random number between 1-13 for rank
		int rank = 1 + (int)(Math.random() * 13);
		
		// Pick a random number between 1-4 for suit
		int suit = 1 + (int)(Math.random() * 4);
		
		// Display rank 
		System.out.print("The card you picked is ");
		if (rank == 1)
			System.out.print("Ace");
		else if (rank == 11)
			System.out.print("Jack");
		else if (rank == 12)
			System.out.print("Queen");
		else if (rank == 13)
			System.out.print("King");
		else
			System.out.print(suit);
		
		// Display suit (used if statement and then switch for practice)
		switch (suit){
			case 1: System.out.print(" of Clubs");
			break;
			case 2: System.out.print(" of Diamonds");
			break;
			case 3: System.out.print(" of Hearts");
			break;
			case 4: System.out.print(" of Spades");
		}	
	}
}
