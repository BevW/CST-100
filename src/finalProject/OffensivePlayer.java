package finalProject;

import java.util.Random;

public class OffensivePlayer extends NFLPlayers implements Celebrator {
	
	private int status;
	private int offensiveTouchDowns;
	private int rushingAndReceivingTouchDowns;
	private int passingYards;
	private int rushingYards;
	private int longestRushingAttempt;
	private int receivingYards;
	private int interceptionsThrown;
	private int longestReception;
	private double completion;
	private int fumbles;
	private double quarterbackRating;
	private int timesSacked;
	private int yardsLostDueToSacks;
	private double receivingYardsPerTarget;
	private int passTargets;
	
	// No args constructor
	public OffensivePlayer(){
	}
	// Constructor
	public OffensivePlayer(String name, String position, String highschool, String college,
			int age, int height, double weight, double grade, int round, double averageFortyYardDash,
			int status, int offensiveTouchDowns, int rushingAndReceivingTouchDowns, int passingYards, int rushingYards,
			int longestRushingAttempt, int receivingYards, int interceptionsThrown, int longestReception, double completion, 
			int fumbles, double quarterbackRating, int timesSacked, int yardsLostDueToSacks, double receivingYardsPerTarget,
			int passTargets){
		super(name, position, highschool, college, age, height, weight, grade, round, averageFortyYardDash);
		this.status = status;
		this.offensiveTouchDowns = offensiveTouchDowns;
		this.rushingAndReceivingTouchDowns = rushingAndReceivingTouchDowns;
		this.passingYards = passingYards;
		this.rushingYards = rushingYards;
		this.longestRushingAttempt = longestRushingAttempt;
		this.receivingYards = receivingYards;
		this.interceptionsThrown = interceptionsThrown;
		this.longestReception = longestReception;
		this.completion = completion;
		this.fumbles = fumbles;
		this.quarterbackRating = quarterbackRating;
		this.timesSacked = timesSacked;
		this.yardsLostDueToSacks = yardsLostDueToSacks;
		this.receivingYardsPerTarget = receivingYardsPerTarget;
		this.passTargets = passTargets;
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
	public int getPassTargets(){
		return passTargets;
	}
	public double getReceivingYardsPerTarget(){
		return receivingYardsPerTarget;
	}
	public int getYardsLostDueToSacks(){
		return yardsLostDueToSacks;
	}
	public int getTimesSacked(){
		return timesSacked;
	}
	public double getQuarterbackRating(){
		return quarterbackRating;
	}
	public int getFumbles(){
		return fumbles;
	}
	public double getCompletion(){
		return completion;
	}
	public int getLongestReception(){
		return longestReception;
	}
	public int getInterceptionsThrown(){
		return interceptionsThrown;
	}
	public int getLongestRushingAttempt(){
		return longestRushingAttempt;
	}
	public int getRushingAndReceivingTouchDowns(){
		return rushingAndReceivingTouchDowns;
	}
	public int getOffensiveTouchDowns(){
		return offensiveTouchDowns;
	}
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
	public void setPassTargets(int passTargets){
		this.passTargets = passTargets;
	}
	public void setReceivingYardsPerTarget(int receivingYardsPerTarget){
		this.receivingYardsPerTarget = receivingYardsPerTarget;
	}
	public void setYardsLostDueToSacks(int yardsLostDueToSacks){
		this.yardsLostDueToSacks = yardsLostDueToSacks;
	}
	public void setTimesSacked(int timesSacked){
		this.timesSacked = timesSacked;
	}
	public void setQuarterbackRating(double quarterbackRating){
		this.quarterbackRating = quarterbackRating;
	}
	public void setFumbles(int fumbles){
		this.fumbles = fumbles;
	}
	public void setCompletion(double completion){
		this.completion = completion;
	}
	public void setLongestReception(int longestReception){
		this.longestReception = longestReception;
	}
	public void setInterceptionsThrown(int interceptionsThrown){
		this.interceptionsThrown = interceptionsThrown;
	}
	public void setLongestRushingAttempt(int longestRushingAttempt){
		this.longestRushingAttempt = longestRushingAttempt;
	}
	public void setRushingAndReceivingTouchDowns(int rushingAndReceivingTouchDowns){
		this.rushingAndReceivingTouchDowns = rushingAndReceivingTouchDowns;
	}
	public void setOffensiveTouchDowns(int offensiveTouchDowns){
		this.offensiveTouchDowns = offensiveTouchDowns;
	}
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
		return super.toString() + String.format("\nStatus: \tOffensive Touchdowns: \tRushing & Receiving TouchDowns: "
				+ "\nPassing Yards: \tRushing Yards: \nLongest Rushing Attempt: \tReceiving Yards: \nInterceptions Thrown: "
				+ "\tLongest Reception: \nCompletion: \tFumbles: \nQuarterback Rating: \n Times Sacked: \tYards Lost Due To Sacks: "
				+ "\nReceiving Yards Per Target: \tPass Targets: ", 
				status, offensiveTouchDowns, rushingAndReceivingTouchDowns, passingYards, 
				rushingYards, longestRushingAttempt, receivingYards, interceptionsThrown, longestReception, completion, 
				fumbles, quarterbackRating, timesSacked, yardsLostDueToSacks, receivingYardsPerTarget, passTargets);
	}
}
