package topic05.chapter11;

public class SavingsAccount extends Account{

	private double savingsBalance;
	
	// No args constructor
	public SavingsAccount(){
		super();
	}
	// Constructor
	public SavingsAccount(int id, double balance){
		super(id, balance);
	}
	// Getter for savings account balance
	public double getSavingsBalance(){
		return savingsBalance;
	}
	// Setter for saving account balance
	public void setSavingsBalance(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
	// Withdraw money
	public void withdraw(double amount){
		setBalance(getBalance() - amount);
	}
	// Deposit money
	public void deposit(double amount){
		setBalance(getBalance() + amount);
	}
	public String toString(){
		return super.toString() + " Savings: " + getSavingsBalance();
	}
}
