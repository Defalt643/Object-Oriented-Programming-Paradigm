package Quiz_Lab_Week2;

public class Customer{
	public String firstName,lastName;
	public BankAccount account;
	BankAccount A = new BankAccount();
	public Customer(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}public String getName() {
		return firstName+lastName;
	}public BankAccount getAccount() {
		return account;
	}public void openAccount(double intialBalance) {
		A.deposit(intialBalance);
	}public void showInfo() {
		System.out.println("Name : "+firstName+" "+lastName);
		System.out.println("Balance : "+A.getBalance());
	}public void deposit(double amount) {
		A.deposit(amount);
	}public void withdraw(double amount) {
		A.withdraw(amount);
	}public double getBalance() {
		return A.getBalance();
	}
}
