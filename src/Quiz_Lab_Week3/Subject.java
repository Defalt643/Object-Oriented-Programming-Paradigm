package Quiz_Lab_Week3;

public class Subject {
	String id,name;
	public Subject(String id,String name) {
		this.id=id;
		this.name=name;
	}public String getId() {
		return id;
	}public String getName() {
		return name;
	}public void setId(String id) {
		this.id=id;
	}public void setName(String name) {
		this.name=name;
	}public String toString() {
		return id+" "+name;
	}
}
