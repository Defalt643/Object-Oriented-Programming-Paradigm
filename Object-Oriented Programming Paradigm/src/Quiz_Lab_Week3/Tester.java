package Quiz_Lab_Week3;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.printf("Enter the number of student : ","\n");
		int x =kb.nextInt();
		String id,name,a,b;
		double grade;
		Student st[] = new Student[x];
		for(int i=0;i<x;i++) {
			System.out.printf("Enter data : ","\n");
			id=kb.next();
			name=kb.next();
			grade=kb.nextDouble();
			a=kb.next();
			b=kb.next();
			Subject s = new Subject(a,b);
			st[i]=new Student(id,name,grade,s);
		}System.out.printf("Enter subject [id/name] : ","\n");
		String y=kb.next();
		for(int i=0;i<x;i++) {
			if(y.equals(st[i].getSubject().getId())) {
				System.out.println(st[i]);
			}else if(y.equals(st[i].getSubject().getName())){
				System.out.println(st[i]);
			}
		}
	}

}
