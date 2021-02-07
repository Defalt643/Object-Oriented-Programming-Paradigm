package Quiz_Lab_Week6;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.printf("Enter number of person : ","\n");
		int x=kb.nextInt();
		Police po[]=new Police[x];
		Sheriff sh[]=new Sheriff[x];
		String name,state;
		int bornYear,count = 0;
		for(int i=0;i<x;i++) {
			System.out.printf("Enter information of person ("+(i+1)+") [type name bornYear workPlace] : ","\n");
			char type=kb.next().charAt(0);
			name=kb.next();
			bornYear=kb.nextInt();
			state=kb.nextLine();
			if(type=='S'|| type=='s') {
				sh[i]=new Sheriff(name,bornYear,state);
				po[i]=new Police();
			}else{
				po[i]=new Police(name,bornYear,state);
				sh[i]=new Sheriff();
			}
		}System.out.printf("Enter Year : ","\n");
		int year=kb.nextInt();
		for(int i=0;i<x;i++) {
			if(year==po[i].getYear()) {
				System.out.println(po[i].getInfo());
				count+=1;
			}else if(year==sh[i].getYear()) {
				System.out.println(sh[i].getInfo());
				count+=1;
			}	
		}
		if(count==0) {	
			System.out.println("not found!!!");
		}
	}
}