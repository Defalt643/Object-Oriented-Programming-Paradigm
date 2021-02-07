package Quiz_Lab_Week10;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		Person[] p=new Person[x];
		for(int i=0;i<x;i++) {
			char type =kb.next().charAt(0);
			if(type=='s' || type=='S') {
				p[i]=new Sheriff(kb.next(),kb.nextInt(),kb.next());
			}else if(type=='p' || type=='P') {
				p[i]=new Police(kb.next(),kb.nextInt(),kb.next());
			}
		}char type =kb.next().charAt(0);
		String workOffice=kb.next();
		for(int i=0;i<x;i++) {
			if(type==p[i].getType()) {
				if(workOffice.equals(p[i].getWork())) {
					p[i].introduce();
				}
			}
		}
	}

}
