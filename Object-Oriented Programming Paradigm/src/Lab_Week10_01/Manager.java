package Lab_Week10_01;
public class Manager extends Employee{
	String parkingNo;
	public Manager() {
		parkingNo="unknow";
	}public Manager(String name,double salary,String parkingNo){
		super.name=name;
		super.salary=salary;
		this.parkingNo=parkingNo;
	}public double calSalary() {
		return super.salary;
	}public String toString() {
		return "My name is "+super.name+". I am a manager.\nMy salary is "+calSalary()+"\nParking No : "+parkingNo;
	}
}
