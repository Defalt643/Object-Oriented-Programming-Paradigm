package Quiz_Lab_Week4;

public class PreferredCustomer extends Customer{
	double amount;
	int discountLevel;
	public PreferredCustomer() {
		amount=0;
		discountLevel=0;
	}public PreferredCustomer(double amount){
		this.amount=amount;
	}public PreferredCustomer(String cusNo,boolean wantMailList,double amount){
		super(cusNo,wantMailList);
		this.amount=amount;
		if(amount<=500) {
			discountLevel=5;
		}else if(amount >=1000 && amount<1500) {
			discountLevel=6;
		}else if(amount >=1500&& amount<2000) {
			discountLevel=7;
		}else if(amount >1999) {
			discountLevel=10;
		}
	} 
	public void setDiscount(int discount) {
		this.discountLevel=discount;
	}public int getDiscount() {
		return discountLevel;
	}
	public String toString() {
		return "***PreferredCustomer***\n" +super.toString()+
				"\namount = "+amount+"\ndiscountLevel = "+discountLevel;
	}
	
}
