package Quiz_Lab_Week1_refactor_code;

public class Employee {
		String name,surname,department;
		int id;
		public Employee(String x,String x1,int y,String z){
			name=x;
			surname=x1;
			id=y;
			department=z;
		}public Employee(){
			name="unknow";
			surname="unknow";
			id=0;
			department="unknow";
		}public void setInfo(String x,String x1,int y,String z) {
			name=x;
			surname=x1;
			id=y;
			department=z;
		}public void getInfo() {
			System.out.println("Name : "+name+" "+surname);
			System.out.println("ID : "+id);
			System.out.println("Department : "+department);
		}
}
