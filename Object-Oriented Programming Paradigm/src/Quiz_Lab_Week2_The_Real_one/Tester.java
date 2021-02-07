package Quiz_Lab_Week2_The_Real_one;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		Employee emp1 = new Employee();
		emp1.setter(1234, "Jack");
		emp1.setterAddress("Muang","Chon Buri","Thailand");
		emp1.getterInfo();
		System.out.println();
		Employee emp2 = new Employee();
		System.out.printf("Enter Employee ID : ","\n");
		int ID = kb.nextInt();
		System.out.printf("Enter name : ","\n");
		String name = kb.next();
		System.out.printf("Enter city : ","\n");
		String city =kb.next();
		System.out.printf("Enter province : ","\n");
		String province =kb.next();
		System.out.printf("Enter country : ","\n");
		String country =kb.next();
		emp2.setter(ID, name);
		emp2.setterAddress(city, province, country);
		emp2.getterInfo();
	}

}
