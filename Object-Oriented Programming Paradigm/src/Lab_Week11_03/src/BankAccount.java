
public class BankAccount implements Measurable{
	private String accNo;
	double balance;
	public BankAccount(String accNo,double balance) {
		this.accNo=accNo;
		this.balance=balance;
	}public String getAccNo() {
		return accNo;
	}public void setAccNo(String accNo) {
		this.accNo=accNo;
	}
	@Override
	public double getMeasurable() {
		return balance;
	}public String toString() {
		return "Acc no : "+getAccNo()+" Balance : "+getMeasurable();
	}

}
