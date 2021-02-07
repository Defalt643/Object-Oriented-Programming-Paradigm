package Quiz_Lab_Week2;

public class BankAccount {
	public double balance;
	public BankAccount() {
		balance = 0;
	}public BankAccount(double amount){
		balance = amount;
	}public void deposit(double amount){
		balance = balance+amount;
	}public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Sorry, your balance is "+balance);
		}else {
			balance=balance-amount;
		}
	}public double getBalance() {
		return balance;
		
	}
}
