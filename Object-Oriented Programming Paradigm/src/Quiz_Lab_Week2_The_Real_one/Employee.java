package Quiz_Lab_Week2_The_Real_one;

public class Employee {
	int empID;
	String name;
	Address address;
	Address emp1 = new Address();
	public Employee() {
		empID=0;
		name = "Unknow";
	}public void setter(int x,String y) {
		empID =x;
		name = y;
	}public void setterAddress(String x,String y,String z) {
		emp1.setter(x, y, z);
	}public void getterInfo() {
		System.out.println("Name : "+name);
		System.out.println("Employee ID : " +empID);
		emp1.getterInfo();
	}
}
