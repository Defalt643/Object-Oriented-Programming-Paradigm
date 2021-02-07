package Quiz_Lab_Week6;

public class Sheriff extends Person{
	String workState;
	public Sheriff() {
		super("Unknow",0000);
	}
	public Sheriff(String name,int bornYear,String workState) {
		super(name,bornYear);
		this.workState=workState;
	}public void introduce() {
		super.introduce();
		System.out.println("I'm a sheriff and work in "+workState);
	}public String getInfo() {
		return "Name = "+name+" Age = "+(date.getYear()-bornYear-1);
	}public int getYear() {
		return bornYear;
	}
}
	
