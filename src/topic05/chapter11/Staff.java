package topic05.chapter11;

public class Staff extends Employee {

	private String title;
	
	// No args constructor
	public Staff(){
	}
	// Crate constructor
	public Staff(String name, String address, String phoneNumber, String emailAddress,
			int office, int dateHired, double salary, String title){
		super(name, address, phoneNumber, emailAddress, office, dateHired, salary);
		this.title = title;	
	}
	// Getter to get title
	public String getTitle(){
		return title;
	}
	// Setter to set title
	public void setTitle(String title){
		this.title = title;
	}
	// toString method (book)
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}
	
