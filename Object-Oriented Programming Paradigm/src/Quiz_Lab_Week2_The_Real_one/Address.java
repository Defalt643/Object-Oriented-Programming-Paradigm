package Quiz_Lab_Week2_The_Real_one;

public class Address {
	String city,province,country;
	
	public Address(){
		city="unknow";
		province="unknow";
		country="unknow";
	}public void setter(String x,String y,String z) {
		city=x;
		province=y;
		country=z;
	}public void getterInfo(){
		System.out.println("Province : "+province);
		System.out.println("City : "+city);
		System.out.println("Country : "+country);
	}
}
