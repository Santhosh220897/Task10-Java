package task10;

public class Account {
	
	// Task10 - Question4 - Account Balance
	
	// Input deposit-80,withdraw-100
	
	// Creating balance variable to store in Double data type.

	double balance;

	public static void main(String[] args) {
		
		//two object is implemented.

		Account account1 = new Account();
		Account account2 = new Account(80.0);
		
		// Initial account balance

		System.out.println("Account 1 balance is: Rs" + account1.getBalance());
		System.out.println("Account 2 balance is: Rs" + account2.getBalance());
		
		// Account balance after deposit & withdraw method used.

		account1.deposit(80.0);
		account2.withdraw(100.0);

		System.out.println("Account 1 balance is: Rs" + account1.getBalance());
		System.out.println("Account 2 balance is: Rs" + account2.getBalance());

	}
    
	// Constructor method without parameter
	public Account() {

		this.balance = 0.0;
	}
	//Constructor method with parameter

	public Account(double initalBalance) {

		this.balance = initalBalance;

	}

	public double getBalance() {
		return balance;
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: Rs" + amount);
		} else {
			System.out.println("Invalid deposit amount. Amount must be greater than 0.");
		}
	}
	
	// withdraw method

	public void withdraw(double amount) {
		if (amount > 0) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawn: RS" + amount);
			} else {
				System.out.println("Insufficient funds. Unable to withdraw Rs" + amount);
			}
		} else {
			System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
		}
	}
}

// Output

/* Account 1 balance is: Rs0.0
   Account 2 balance is: Rs80.0
   Deposited: Rs80.0
   Insufficient funds. Unable to withdraw Rs100.0
   Account 1 balance is: Rs80.0
   Account 2 balance is: Rs80.0      */

