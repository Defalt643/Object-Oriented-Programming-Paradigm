package Quiz_Lab_Week10;

public class Police extends Person{
	String workCountry;
	public Police(String name,int bornYear,String workCountry) {
		super(name,bornYear);
		this.workCountry=workCountry;
		super.type='P';
		super.work=workCountry;
	}public void introduce() {
		super.introduce();
	}public String getWorkCountry() {
		return workCountry;
	}
}
