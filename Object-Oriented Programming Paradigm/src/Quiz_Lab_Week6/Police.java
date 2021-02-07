package Quiz_Lab_Week6;

public class Police extends Person{
	String workCountry;
	public Police() {
		super("Unknow",0000);
	}
	public Police(String name,int bornYear,String workCountry) {
		super(name,bornYear);
		this.workCountry=workCountry;
	}public void introduce() {
		super.introduce();
		System.out.println("I'm a police and work in "+workCountry);
	}public String getInfo() {
		return "Name = "+name+" Age = "+(date.getYear()-bornYear-1);
	}public int getYear() {
		return bornYear;
	}
}
