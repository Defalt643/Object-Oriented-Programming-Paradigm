package Lab_Week10_01;

public class Tester {

	public static void main(String[] args) {
		Employee[] em=new Employee[5]; 
		Sales s1 = new Sales("Jame",15000,5000);
		Sales s2 = new Sales("Bell",20000,8000);
		em[0]=s1;
		em[1]=s2;
		Manager m1 = new Manager("Peter",40000,"40-19");
		em[2]=m1;
		Programmer p1 = new Programmer("Ann",30000,0,2);
		String[] skillp1= {"Java","C"};
		p1.addSkill(skillp1);
		Programmer p2 = new Programmer("Bank",40000,5000,3);
		String[] skillp2= {"Java","PHP","Python"};
		p2.addSkill(skillp2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(m1.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

}
