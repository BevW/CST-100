package topic5.chapter11;

public class Student extends Person {

	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;
	
	// No args constructor
	public Student(){
	}
	// Create constructor
	public Student(String name, String address, String phoneNumber, String emailAddress, int status){
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}
	
	// Getter to return status
	public String getStatus(){
		switch (status) {
			case 1: return "Freshman";
			case 2: return "Sophmore";
			case 3: return "Junior";
			case 4: return "Senior";
			default: return "The status is not known";
		}
	}
	
	// Setter method to set new status
	public void setStatus(int status){
		this.status = status;
	}
	
	// toString method (from book)
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
	
}
