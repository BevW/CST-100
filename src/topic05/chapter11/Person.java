package topic05.chapter11;

public class Person{
	
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	// Default constructor
	public Person(){
		this ("unknown", "unknown", "unknown", "unknown");
	}
	// Was created as a quick fix from and error message
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	// Getter for name
	public String getName(){
		return name;
	}
	// Getter for address
	public String getAddress(){
		return address;
	}
	// Getter for phone number
	public String getPhoneNumber(){
		return phoneNumber;
	}
	// Getter for emailAddress
	public String getEmailAddress(){
		return emailAddress;
	}
	// Setters for name, address, phone, and email
	public void setName(String name){
		this.name = name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
	// toString(from book)
	public String toString(){
		return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + emailAddress;
	}
}
