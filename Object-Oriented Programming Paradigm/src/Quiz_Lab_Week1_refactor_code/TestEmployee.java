package Quiz_Lab_Week1_refactor_code;
import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String name,surname,department;
		int id;
		Employee em1=new Employee("Susan","Meyers",47899,"Accounting");
		Employee em2=new Employee("Mark","Jones",39119,"IT");
		Employee em3=new Employee("Joy","Rogers",81774,"Manufacturing");
		Employee em4=new Employee();
		
		em1.getInfo();
		em2.getInfo();
		em3.getInfo();
		System.out.print("Enter info of employee : ");
		name = kb.next();
		surname=kb.next();
		id=kb.nextInt();
		department=kb.next();
		em4.setInfo(name,surname,id,department);
		em4.getInfo();
	}

}
