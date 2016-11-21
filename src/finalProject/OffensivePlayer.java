package finalProject;

public class OffensivePlayer extends NFLPlayers{
	
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
