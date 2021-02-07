package Quiz_Lab_Week4;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		PreferredCustomer pc = new PreferredCustomer("123-456",true,3000);
		System.out.println(pc);
		System.out.printf("Enter cusNo : ","/n");
		String id =kb.next();
		System.out.printf("You want to the mailling list? (true/false) : ","\n");
		boolean wantMailList = kb.nextBoolean();
		System.out.printf("Enter amount : ","\n");
		double amount =kb.nextDouble();
		PreferredCustomer pc2 = new PreferredCustomer(id,wantMailList,amount);
		System.out.println(pc2);
		if(pc.getDiscount()==pc2.getDiscount()) {
			System.out.println(pc.getCusNo()+" is equal to "+pc2.getCusNo());
		}else {
			System.out.println(pc.getCusNo()+" isn't equal to "+pc2.getCusNo());
		}
	}

}
