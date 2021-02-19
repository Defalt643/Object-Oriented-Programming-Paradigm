
public class Student {
	int id;
	String name;
	double gpa;
	public Student(int id,String name,double gpa) {
		this.id=id;
		this.gpa=gpa;
		this.name=name;
	}public String getName() {
		return name;
	}public String checkStatus() {
		if(gpa>=2) {
			return "Normal";
		}else if(gpa<2 && gpa>=1.75) {
			return "Probation";
		}else {
			return "Retired";
		}
	}public String getType() {
		if(Integer.toString(id).charAt(2)=='1') {
			return "Day";
		}else {
			return "Special";
		}
	}
}
