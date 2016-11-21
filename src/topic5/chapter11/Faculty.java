package topic5.chapter11;

public class Faculty extends Employee{

	private int officeHours;
	private int rank;
	
	// No args constructor
	public Faculty(){
	}
	// Constructor
	public Faculty(String name, String address, String phoneNumber, String emailAddress,
			int officeHours, int rank){
		this.officeHours = officeHours;
		this.rank = rank;
	}
	// Getters for office hours and rank
	public int getOfficeHours(){
		return officeHours;
	}
	public int getRank(){
		return rank;
	}
	// Setters for office hours and rank
	public void setOfficeHours(int officeHours){
		this.officeHours = officeHours;
	}
	public void setRank(int rank){
		this.rank = rank;
	}
	// toString (from book)
	public String toString(){
		return super.toString() + "\nOffice Hours: " + officeHours + "\tRank: " + rank;
	}
}
