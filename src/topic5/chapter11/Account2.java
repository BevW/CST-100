package topic5.chapter11;
import java.util.ArrayList;
import java.util.Date;

public class Account2{
		//creating data fields
		private String name;
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated;
		private ArrayList<Transactions>transactions;
		
		//no-arg constructor and constructor with specified info
		Account2(){
			name = "";
			id = 0;
			balance = 0;
			annualInterestRate = 0;
			dateCreated = new Date();
			transactions = new ArrayList<Transactions>();
		}
		Account2(String name, int newId, double newBalance) {
			this.name = "";
			this.id = id;
			this.balance = balance;
			dateCreated = new Date();
			transactions = new ArrayList<Transactions>();
		}
		
		//getter (aka accessor) methods
		public String getName(){
			return name;
		}
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
		public ArrayList<Transactions> getTransactions(){
			return transactions;
		}
		
		//setter (aka mutator) methods
		public void setName(String name){
			this.name = name;
		}
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
