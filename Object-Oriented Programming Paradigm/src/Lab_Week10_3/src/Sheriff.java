
public class Sheriff extends Person{
	String workState;
	public Sheriff(String name,int bornYear,String workPlace) {
		super(name,bornYear);
		this.workState=workPlace;
	}public void introduce() {
		super.introduce();
		System.out.println("I'm a sheriff and work in "+workState);
	}
}
