package topic5.chapter11;

public class Staff extends Employee {

	private String title;
	
	// No args constructor
	public Staff(){
	}
	// Crate constructor
	public Staff(String name, String address, String phoneNumber,String emailAddress, String title){
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
	
