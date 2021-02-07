package Quiz_Lab_Week5;

public class Teacher extends Person{
	int salary;
	String academic_postion;
	public Teacher() {
		salary=0;
		academic_postion="unknow";
	}public Teacher(int salary,String academic_position){
		this.salary=salary;
		this.academic_postion=academic_position;
	}public Teacher(Person p,int salary,String academic_position){
		super(p.getName(),p.getAge(),p.getType());
		this.salary=salary;
		this.academic_postion=academic_position;
	}public String toString() {
		return Person.class.toString()+" "+salary+" "+academic_postion;
	}
}
