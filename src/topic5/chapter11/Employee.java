package topic5.chapter11;

public class Employee extends Person {

	private int office;
	private int dateHired;
	private double salary;
	
	// Create no args constructor
	public Employee(){
	}
	
	// Create constructor
	public Employee(String name, String address, String phone, String email, int office,
			int dateHired, double salary){
		this.office = office;
		this.dateHired = dateHired;
		this.salary = salary;
		}
	// Getter to get office
	public int getOffice(){
		return office;
	}
	// Getter to get dateHired
	public int getDateHired(){
		return dateHired;
	}
	// Getter to get salary
	public double getSalary(){
		return salary;
	}
	// Setter to set office
	public void setOffice(int office){
		this.office = office;
	}
	// Setter to set dateHired
	public void setDateHired(int dateHired){
		this.dateHired = dateHired;
	}
	// Setter to set salary
	public void setSalary(double salary){
		this.salary = salary;
	}
	// To string method (from book)
	public String toString(){
		return super.toString() + "\nOffice Number: " + getOffice() + "\tDate hired: " + getDateHired() + "\tSalary is " + getSalary();
	}
}
