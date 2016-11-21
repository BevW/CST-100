package topic5.chapter11;

public class CheckingAccount extends Account{
	
	// Amount account can overdraw by
	private double overdraft;
	
	// no args constructor
	public CheckingAccount(){
	}
	// Constructor
	public CheckingAccount(int id, double balance, double overdraft){
		this.overdraft = overdraft;
	}
	// Getter for overdraft 
	public double getOverdraft(){
		return overdraft;
	}
	// Setter for overdraft
	public void setOverdraft(double overdraft){
		this.overdraft = overdraft;
	}
	// Withdraw
	public void withdraw(double amount){
		if (getBalance() - amount > overdraft)
			setBalance(getBalance() - amount);
		else 
			System.out.println("Over withdraw limit");
	}
	public String toString(){ 
		return super.toString() + "Overdraft limit is $" + overdraft;
	}
}
