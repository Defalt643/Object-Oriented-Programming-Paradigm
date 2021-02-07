package Lab_Week10_01;
public class Employee {
	String name;
	double salary;
	public Employee() {
		name="unknown";
		salary=0;
	}public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}public double calSalary() {
		return salary;
	}public String toString() {
		return "My name is "+name+". I am an employee";
	}
}
