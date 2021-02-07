package Quiz_Lab_Week10;

public class Sheriff extends Person{
	String workPlace;
	public Sheriff(String name,int bornYear,String workPlace) {
		super(name,bornYear);
		this.workPlace=workPlace;
		super.type='S';
		super.work=workPlace;
	}public void introduce() {
		super.introduce();
	}public String getWorkPlace() {
		return workPlace;
	}
}
