package Quiz_Lab_Week5;

public class Student extends Person{
	String id;
	double gpa;
	public Student() {
		this.id="Unknow";
		this.gpa=0;
	}public Student(String id,double gpa){
		this.id=id;
		this.gpa=gpa;
	}public Student(Person p,String id ,double gpa){
		super(p.getName(),p.getAge(),p.getType());
		this.id=id;
		this.gpa=gpa;
	}public String toString() {
		return Person.class.toString()+" "+id+" "+gpa;
	}
}
