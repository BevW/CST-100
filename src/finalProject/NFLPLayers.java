package finalProject;

public class NFLPlayers implements Celebrator {

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
		double average = (dash1 + dash2 + dash3) / 3;
		return average;
	}
	
	//setters for properties
	public void setName(String name){
		this.name = name;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public void setHighschool(String highschool){
		this.highschool = highschool;
	}
	public void setCollege(String college){
		this.college = college;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public void setGrade(double grade){
		this.grade = grade;
	}
	public void setRound(int round){
		this.round = round;
	}
	public void setAverageFortyYardDash(double averageFortyYardDash){
		this.averageFortyYardDash = averageFortyYardDash;
	}
	public String toString(){
		return "Name: " + name + "\t" + position + "\nHighschool: " + highschool + "\n College: " + college +
				"\nAge: " + age + "\nHeight: " + height + "\tWeight: " + weight + "\nGrade: " + grade +
				"\tRound: " + round + "\nAverage Forty Yard Dash: " + averageFortyYardDash;
	}
	
	// A method we must have that has 5 default celebrations
	
	@Override
	public String celebrate() {
		// TODO Auto-generated method stub
		return "";
	}
	
	
	
}
	
	