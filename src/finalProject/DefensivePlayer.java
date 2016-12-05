package finalProject;

import java.util.Random;

public class DefensivePlayer extends NFLPlayers{
	
	private int status;
	private int tackles;
	private int tacklesForLoss;
	private int sacks;
	private int interceptions;
	private int interceptionYards;
	private int fumblesRecovered;
	private int fumblesForced;
	private int assists;
	private int breakUps;
	private int blockKicks;
	private	int defensiveTouchDowns;
	
	// No args constructor
	public DefensivePlayer(){
	}
	// Constructor
	public DefensivePlayer(String name, String position, String highschool, String college,
			int age, int height, double weight, double grade, int round, double averageFortyYardDash,
			int status, int tackles, int tacklesForLoss, int sacks, int interceptions, int interceptionYards,
			int fumblesRecovered, int fumblesForced, int assists, int breakUps, int blockKicks, int defensiveTouchDowns){
		super(name, position, highschool, college, age, height, weight, grade, round, averageFortyYardDash);
		this.status = status;
		this.tackles = tackles;
		this.tacklesForLoss = tacklesForLoss;
		this.sacks = sacks;
		this.interceptions =interceptions;
		this.interceptionYards = interceptionYards;
		this.fumblesRecovered = fumblesRecovered;
		this.fumblesForced = fumblesForced;
		this.assists = assists;
		this.breakUps = breakUps;
		this.blockKicks = blockKicks;
		this.defensiveTouchDowns = defensiveTouchDowns;
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
	public int getDefensiveTouchDowns(){
		return defensiveTouchDowns;
	}
	public int getBlockKicks(){
		return blockKicks;
	}
	public int getBreakUps(){
		return breakUps;
	}
	public int getAssists(){
		return assists;
	}
	public int getFumblesForced(){
		return fumblesForced;
	}
	public int getFumblesRecovered(){
		return fumblesRecovered;
	}
	public int getInterceptionYards(){
		return interceptionYards;
	}
	public int getTacklesForLoss(){
		return tacklesForLoss;
	}
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
	public void setDefensiveTouchDowns(int defensiveTouchDowns){
		this.defensiveTouchDowns = defensiveTouchDowns;
	}
	public void setBlockKicks(int blockKicks){
		this.blockKicks = blockKicks;
	}
	public void setBreakUps(int breakUps){
		this.breakUps = breakUps;
	}
	public void setAssists(int assists){
		this.assists = assists;
	}
	public void setFumblesForced(int fumblesForced){
		this.fumblesForced = fumblesForced;
	}
	public void setFumblesRecoered(int fumblesRecovered){
		this.fumblesRecovered = fumblesRecovered;
	}
	public void setInterceptionYards(int interceptionYards){
		this.interceptionYards = interceptionYards;
	}
	public void setTacklesForLoss(int tacklesForLoss){
		this.tacklesForLoss = tacklesForLoss;
	}
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
		return super.toString() + String.format("\nStatus: \nTackles: \tTackesForLoss: \nSacks: \nInterceptions: \tInterception Yards: "
				+ "\nFumbles Recovered: \tFumbles Forced: \nAssists: \tBreakups: \nBlock Kicks: \tDefensive Touchdowns: ",
				status, tackles, tacklesForLoss, sacks, interceptions, interceptionYards,fumblesRecovered, fumblesForced, assists,
				breakUps, blockKicks, defensiveTouchDowns);
	}
}
