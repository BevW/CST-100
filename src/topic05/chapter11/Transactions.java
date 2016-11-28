package topic05.chapter11;
import java.util.Date;
public class Transactions extends Account2{

	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	// no args constructor
	public Transactions(){
	}
	// Constructor
	public Transactions(char type, double amount, double balance,
			String description){
		date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	// Getters
	public char getType(){
		return type;
	}
	public double getAmount(){
		return amount;
	}
	public double getBalance(){
		return balance;
	}
	public String getDescription(){
		return description;
	}
	// Setters
	public void setType(char type){
		this.type = type;
	}
	public void setAmount(double amount){
		this.amount = amount;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setDescription(){
		this.description = description;
	}
	
}
