

public class Sales extends Employee{
	double commission;
	public Sales() {
		commission =0;
	}public Sales(String name,double salary,double commission){
		super.name=name;
		super.salary=salary;
		this.commission=commission;
	}public double calSalary() {
		return super.salary+commission;
	}public String toString() {
		return "My name is " +super.name+". I am a sales.\nMy salary is "+calSalary();
	}
}
