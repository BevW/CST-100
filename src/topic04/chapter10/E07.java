package topic04.chapter10;

import java.util.Date;
import java.util.Scanner;

public class E07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//Array of 10 accounts with id and $100
		Account [] accounts = new Account [10];
		
		initialBalance(accounts);
		
		//go through main menu
		//couldn't get while to work so had to use do-while
		do {
			System.out.print("Enter ID: ");
			int id = input.nextInt();
			if (validID(id, accounts)){
				int choice;
				do {
					choice = mainMenu(input);
					if (validTransaction(choice)){
						pickTransaction(choice, accounts, id, input);
					}
				}
				while (choice != 4);
			}
		}
		while (true);
	}
	
	//give each index an id and $100
	static void initialBalance (Account [] a) {
		int initialBalance = 100;
		for (int i = 0; i < a.length; i++)
			a[i] = new Account (i, initialBalance);
	}
	//boolean: check id is valid
	static boolean validID(int id, Account[] a) {
		for (int i = 0; i < a.length; i++) {
			if (id == a[i].getId())
				return true;
		}
		return false;
	}
	//main menu
	public static int mainMenu(Scanner input) {
		System.out.print("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4:exit" +
					"\nEnter a choice: ");
		return input.nextInt();
	}
	//check choice
	public static boolean validTransaction(int choice) {
		return choice > 0 && choice < 4;
	}
	public static void pickTransaction(int b, Account [] a, int id, Scanner input) {
		if (b == 1)
			System.out.println("Balance: " + a[id].getBalance());
		else if (b == 2){
			System.out.println("Withdraw Amount: ");
			a[id].withdraw(input.nextDouble());
		}
		else if (b == 3){
			System.out.println("Deposit Amount: ");
			a[id].deposit(input.nextDouble());
		}
	}
}
//Account Class from exercise 9.7
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
