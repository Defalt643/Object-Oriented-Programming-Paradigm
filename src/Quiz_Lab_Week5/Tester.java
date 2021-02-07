package Quiz_Lab_Week5;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.printf("Enter number of person : ","\n");
		int x = kb.nextInt();
		Teacher T[]=new Teacher[x];
		Student S[]=new Student[x];
		Person P[]= new Person[x];
		int pro=0;
		int student=0;
		int teacher=0;
		for(int i=0;i<x;i++) {
			System.out.printf("Enter information of person("+(i+1)+") : ","\n");
			String name=kb.next();
			int age=kb.nextInt();
			char type=kb.next().charAt(0);
			P[i]=new Person(name,age,type);
			if(type=='T') {
				int salary=kb.nextInt();
				String academic_postion=kb.next();
				teacher=teacher+1;
				
			}else if(type=='S') {
				String id=kb.next();
				double gpa=kb.nextDouble();
				if(gpa<2) {
					pro=pro+1;
				}
				S[i]=new Student(P[i],id,gpa);
				student=student+1;
			}
		
		}System.out.println("There are "+student+" student(s).");
		System.out.println("There are "+teacher+" teacher(s).");
		System.out.println("There are "+pro+" student(s) who get probation.");

	}

}
