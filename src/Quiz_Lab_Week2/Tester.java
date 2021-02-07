package Quiz_Lab_Week2;

public class Tester {

	public static void main(String[] args) {
		Customer c1 = new Customer("Jame","Bones");
		c1.openAccount(500.0);
		c1.showInfo();
		System.out.println();
		System.out.println("Deposit : 500.0");
		c1.deposit(500.0);
		System.out.println("Current balance : "+c1.getBalance());
		System.out.println();
		System.out.println("Withdraw : 200.0");
		c1.withdraw(200.0);
		System.out.println("Current balance : "+c1.getBalance());
		System.out.println();
		Customer c2 = new Customer("Bam","Bam");
		c2.openAccount(1000.0);
		c2.showInfo();
		System.out.println();
		System.out.println("Withdraw : 2000.0");
		c2.withdraw(2000.0);
		System.out.println("Withdraw : 1000.0");
		c2.withdraw(1000.0);
		System.out.println("Current balance : "+c2.getBalance());
		System.out.println();
		c2.showInfo();

	}

}
