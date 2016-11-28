package finalProject;

import java.util.Random;

public class OffensivePlayer extends NFLPlayers implements Celebrator {
	
	private int passingYards;
	private int rushingYards;
	private int receivingYards;
	private int status;
	
	// No args constructor
	public OffensivePlayer(){
	}
	// Constructor
	public OffensivePlayer(String name, String position, String highSchool, String college,
			int age, int height, double weight, double grade, int round, double averageFortyYardDash,
			int passingYards, int rushingYards, int receivingYards){
		this.passingYards = passingYards;
		this.rushingYards = rushingYards;
		this.receivingYards = receivingYards;
	}
	
	
	// Celebrate method
	public String celebrate(){
		// Exclusive celebration
		String [] celebrate = {" He then gives high fives to all of his teammates!"};
		int randomCelebrate = new Random().nextInt(Celebrator.celebrate.length);
		String randomCelebration = (Celebrator.celebrate[randomCelebrate]);
		return this.name + randomCelebration + celebrate;
	}
	
	// Getters
	public int getPassingYards(){
		return passingYards;
	}
	public int getRushingYards(){
		return rushingYards;
	}
	public int getReceivingYards(){
		return receivingYards;
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
	public void setPassingYards(int passingYards){
		this.passingYards = passingYards;
	}
	public void setRushingYards(int rushingYards){
		this.rushingYards = rushingYards;
	}
	public void setReceivingYards(int receivingYards){
		this.receivingYards = receivingYards;
	}
	@Override
	public String getCollege(){
		return super.college + "\tCollege Status: " + status;
	}
	@Override
	public String toString(){
		return super.toString() + "\nPassing Yards: " + passingYards + "\tRushing Yards: " + rushingYards +
				"\nReceiving Yards: " + receivingYards;
	}
}
