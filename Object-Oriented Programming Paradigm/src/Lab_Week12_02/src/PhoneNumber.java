
public class PhoneNumber {
	String type,name;
	String PhoneNumber;
	public PhoneNumber(String name,String PhoneNumber) {
		this.name=name;
		this.PhoneNumber=PhoneNumber;
	}public String getName() {
		return name;
	}public String getPhoneNumber() {
		return PhoneNumber;
	}public String toString() {
		return "Name : "+name+" Phone : "+PhoneNumber;
	}
}
