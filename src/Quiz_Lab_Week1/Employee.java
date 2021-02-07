package Quiz_Lab_Week1;

public class Employee {
	//attributes
	String Name,Surname,Department;
	int Id;
	//constructors
	public Employee() {
		Name = "unknow";
		Surname ="unknow";
		Id = 0;
		Department = "unknow";
	}//methods
	public void setInfo(String name,String surname , int id ,String department) {
		Name = name;
		Surname = surname;
		Id = id;
		Department = department;
	}/*VVVVVVVVVVVVVในโจทย์ให้มีแต่กูไม่ได้ใช้เลยอะVVVVVVVVVVVVVVV*/
	public String getName() {
		return Name;
	}public String getSurname() {
		return Surname;
	}public int getId() {
		return Id;
	}public String getDepartment() {
		return Department;
	}/*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
	public void showInfo() {
		System.out.println("Name : "+Name+" "+Surname);
		System.out.println("Id : "+Id);
		System.out.println("Department : "+Department);
	}
}