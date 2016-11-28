package topic05.chapter11;

import java.util.Date;

public class Account {
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
		public String toString(){
			return "ID: " + getId() + "\tBalance: " + getBalance();
		}
}
