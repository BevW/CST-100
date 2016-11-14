package finalProject;

public class NFLPLayers {

	//name of player
	String name;
	//position the player is eligible for (e.g. QB)
	String position;
	//highschool player graduated from
	String highschool;
	//college player attended
	String college;
	//how old player is in years
	int age;
	//how tall player is in feet and inches
	int height;
	//how much the player weighs in pounds
	double weight;
	//number assigned by NFL expert based on performance
	double grade;
	//projected round the player will be picked
	int round;
	//the average time of 3 attempts running a forty yard dash
	double averageFortyYardDash;

	//Getter for properties
	public String getName(){
		return name;
	}
	public String getPosition(){
		return position;
	}
	public String getHighschool(){
		return highschool;
	}
	public String getCollege(){
		return college;
	}
	public int getAge(){
		return age;
	}
	public static String getHeight(){
		int totalInches = 0;
		int feet = totalInches / 12;
		int inches = totalInches % 12;
		return feet + "' " + inches + "\"";
	}
	public double getWeight(){
		return weight;
	}
	public double getGrade(){
		return grade;
	}
	public int getRound(){
		return round;
	}
	public static double getAverageFortyYardDash(){
		double dash1 = 0.0;
		double dash2 = 0.0;
		double dash3 = 0.0;
		double average = (dash1 + dash2 +dash3) / 3;
		return average;
	}
	
	//setters for properties
	public void setName(String newName){
		name = newName;
	}
	public void setPosition(String newPosition){
		position = newPosition;
	}
	public void setHighschool(String newHighschool){
		highschool = newHighschool;
	}
	public void setCollege(String newCollege){
		college = newCollege;
	}
	public void setAge(int newAge){
		age = newAge;
	}
	public void setHeight(int newHeight){
		height = newHeight;
	}
	public void setWeight(double newWeight){
		weight = newWeight;
	}
	public void setGrade(double newGrade){
		grade = newGrade;
	}
	public void setRound(int newRound){
		round = newRound;
	}
	public void setAverageFortyYardDash(double newAverageFortyYardDash){
		averageFortyYardDash = newAverageFortyYardDash;
	}
}
	
	