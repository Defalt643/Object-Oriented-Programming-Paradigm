package Quiz_Lab_Week3;

public class Student {
	String id,name;
	double grade;
	Subject s;
	public Student(String id,String name,double grade,Subject s) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.s=s;
	}public String getId() {
		return id;
	}public String getName() {
		return name;
	}public Subject getSubject() {
		return s;
	}public void setId(String x) {
		id=x;
	}public void setName(String x) {
		name=x;
	}public String toString() {
		return id+" "+name+" "+grade+" "+s;
	}
}
