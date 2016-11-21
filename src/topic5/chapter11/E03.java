package topic5.chapter11;

public class E03 extends Account{
/*
Subclasses of Account) In Programming Exercise 9.7, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw
funds. Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and then implement them. Write
a test program that creates objects of Account, SavingsAccount, and
CheckingAccount and invokes their toString() methods.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objects
		Account account = new Account(122, 5000);
		SavingsAccount savings = new SavingsAccount(123, 6000);
		CheckingAccount checking = new CheckingAccount(124, 800, -10);
		
		// Am not sure what is wrong
		// Invoke toString() methods
		System.out.println(Account.toString());
		System.out.println(SavingsAccount.toString());
		System.out.println(CheckingAccount.toString());
	}

}
