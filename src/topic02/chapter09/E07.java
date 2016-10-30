package topic02.chapter09;

import java.util.Date;
public class E07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account =  new Account(1122, 20000);
		
		account.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		
		account.deposit(3000);
		
		System.out.println("Date Created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly Interest: $%.2f\n", account.getMonthlyInterest());
		
	}

}



class Account {
	//creating data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//no-arg constructor and constructor with specified info
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	//getter (aka accessor) methods
	public int getId() {
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public String getDateCreated(){
		return dateCreated.toString();
	}
	
	//setter (aka mutator) methods
	public void setId(int newId) {
		id = newId;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	//method that returns the monthly interest rate
	public double getMonthlyInterestRate(){
		return getAnnualInterestRate() / 12;
	}
	//method that returns monthly interest
	public double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}
	//methods withdraw and deposit
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
}
