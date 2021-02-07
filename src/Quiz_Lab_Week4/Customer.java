package Quiz_Lab_Week4;

public class Customer {
	String cusNo;
	boolean wantMailList;
	public Customer() {
		cusNo="unknown";
		wantMailList=false;
	}public Customer(String cusNo,boolean wantMailList){
		this.cusNo=cusNo;
		this.wantMailList=wantMailList;
	}public String toString() {
		return "cusNo = "+cusNo+"\n"+"wantMailList = "+wantMailList;
	}public String getCusNo() {
		return cusNo;
	}
}
