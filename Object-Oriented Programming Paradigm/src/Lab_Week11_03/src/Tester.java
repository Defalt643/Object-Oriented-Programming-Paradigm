import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.printf("Enter the number of BankAccount : ","\n");
		int x=kb.nextInt();
		BankAccount[] b=new BankAccount[x];
		for(int i=0;i<x;i++) {
			b[i]=new BankAccount(kb.next(),kb.nextDouble());
		}for(int i =0;i<x;i++) {
			System.out.println(b[i].toString());
		}System.out.printf("Enter the number of PiggyBank : ","\n");
		x=kb.nextInt();
		PiggyBank[] p = new PiggyBank[x];
		for(int i=0;i<x;i++) {
			System.out.printf("Enter size and the number of deposit : ","\n");
			int y=kb.nextInt();
			int z=kb.nextInt();
			p[i]=new PiggyBank(y);
			for(int o=0;o<z;o++) {
				p[i].addCoins(kb.nextInt(), kb.nextInt());
			}
		}for(int i=0;i<x;i++) {
			System.out.println(p[i].toString());
		}

	}

}
