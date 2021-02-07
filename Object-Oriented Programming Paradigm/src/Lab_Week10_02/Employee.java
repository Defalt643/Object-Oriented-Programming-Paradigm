

public class Employee{
	String name;
	double salary;
	int x=0;
	public Employee() {
		name="unknown";
		salary=0;
	}public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}public double calSalary() {
		return salary;
	}public String toString() {
		return "My name is "+name+".\nI am an employee\nMy salary is "+calSalary();
	}public void addSkill(String[] progSkill) {
		this.progSkill=progSkill;
	}String[] progSkill=new String[x];
}

