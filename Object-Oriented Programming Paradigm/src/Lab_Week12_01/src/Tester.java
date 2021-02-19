import java.util.Scanner;
import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x=kb.nextInt();
		ArrayList<Student> Student = new ArrayList<Student>();
		for(int i=0;i<x;i++) {
			Student.add(i,new Student(kb.nextInt(),kb.next(),kb.nextDouble()));
		}for(int i=0;i<x;i++) {
			System.out.println(Student.get(i).getName()+" ("+Student.get(i).getType()+") "+Student.get(i).checkStatus());
		}

	}

}
