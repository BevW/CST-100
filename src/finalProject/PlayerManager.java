package finalProject;

public class PlayerManager {

	public static void main(String[] args){
		
		//I did not scan(get user input) the names in because I understood that later the names will be preset
		//in our program and the user will have to choose from the names already there.
		//I just made up names because I was not sure if you wanted us to put in real ones.
		
		//array that holds name
		String[] availablePlayers = {"Jimmy Pen", "Robin Cupper", "Beverly Winebrenner",
				"Hope Winebrenner", "John Foster", "Sally Fisher"};
		
		//Display number of names in the array
		System.out.println(availablePlayers.length);
		
		System.out.println(DefensivePlayer.class);
	}
	//A method that counts the number of names in the array
	public static void createPlayer(String[] availablePlayers) {
		for (int a = 0; a < availablePlayers.length; a++); {
			System.out.println(availablePlayers + " ");
		}
	
	}
	
}
//I was unsure exactly what you were looking for. Please give me feed back if you wanted something different and I will fix it.