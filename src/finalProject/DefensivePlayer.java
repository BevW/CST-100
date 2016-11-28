package finalProject;

import java.util.Random;

public class DefensivePlayer extends NFLPlayers{
	
	private int tackles;
	private int sacks;
	private int interceptions;
	private int status;
	
	// No args constructor
	public DefensivePlayer(){
	}
	// Constructor
	public DefensivePlayer(String name, String position, String highSchool, String college,
			int age, int height, double weight, double grade, int round, double averageFortyYardDash, 
			int tackles, int sacks, int interceptions){
		this.tackles = tackles;
		this.sacks = sacks;
		this.interceptions = interceptions;
	}
	
	// Celebrate method
	public String celebrate(){
		// Exclusive celebration
		String [] celebrate = {" He then chest bumps all of his teammates!"};
		int randomCelebrate = new Random().nextInt(Celebrator.celebrate.length);
		String randomCelebration = (Celebrator.celebrate[randomCelebrate]);
		return this.name + randomCelebration + celebrate;
	}
	
	// Getters
	public int getTackles(){
		return tackles;
	}
	public int getSacks(){
		return sacks;
	}
	public int getInterceptions(){
		return interceptions;
	}
	public String getStatus(){
		switch (status) {
			case 1: return "Freshman";
			case 2: return "Sophmore";
			case 3: return "Junior";
			case 4: return "Senior";
			default: return "The status is not known";
		}
	}
	
	// Setters
	public void setTackles(int tackles){
		this.tackles = tackles;
	}
	public void setStack(int sacks){
		this.sacks = sacks;
	}
	public void setInterceptions(int interceptions){
		this.interceptions = interceptions;
	}
	@Override
	public String getCollege(){
		return super.college + "\tCollege Status: " + status;
	}
	@Override
	public String toString(){
		return super.toString() + "\nTackles: " + tackles + "\tSacks: " + sacks +
				"\nInterceptions: " + interceptions;
	}
}
