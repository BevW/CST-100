package topic5.chapter11;

public class E08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object
		Account2 account = new Account2("George", 1122, 1000);
		Transactions transactions = new Transactions();
		
		// Instructed by book
		account.setAnnualInterestRate(1.5);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println("Name: " + account.getName() + "\nInterest Rate: " + account.getAnnualInterestRate() + 
			"\nBalance: " + account.getBalance() + "\nTransactions: " + transactions);
	}

}
