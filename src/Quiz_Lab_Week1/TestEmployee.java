package Quiz_Lab_Week1;

import java.util.Scanner;
public class TestEmployee {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Employee em1 = new Employee();
		Employee em2 = new Employee();
		Employee em3 = new Employee();
		String Name = kb.next();
		String Surname = kb.next();
		int Id=kb.nextInt();
		String Department = kb.next();
		em1.setInfo(Name,Surname,Id,Department);
		
		Name = kb.next();
		Surname = kb.next();
		Id=kb.nextInt();
		Department = kb.next();
		em2.setInfo(Name,Surname,Id,Department);
		
		Name = kb.next();
		Surname = kb.next();
		Id=kb.nextInt();
		Department = kb.next();
		em3.setInfo(Name,Surname,Id,Department);
		
		System.out.println("=================================");
		em1.showInfo();
		System.out.println("=================================");
		em2.showInfo();
		System.out.println("=================================");
		em3.showInfo();
		System.out.println("=================================");
		
		System.out.print("Choose 1-3 to show employee info :");
		int choose= kb.nextInt();
		if(choose ==1) {
			em1.showInfo();
		}else if(choose ==2) {
			em2.showInfo();
		}else if(choose ==3) {
			em3.showInfo();
		}else {
			System.out.println("Sorry you pick wrong number");
		}System.out.println("=================================");
		System.out.printf("lastset employee is ");
		em3.showInfo();
		System.out.println("=================================");
	}
	

}
