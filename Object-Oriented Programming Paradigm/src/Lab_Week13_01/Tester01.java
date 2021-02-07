package Lab_Week13_01;
import java.util.Scanner;
import java.io.*;
public class Tester01 {

	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\ming\\eclipse-workspace\\Object-Oriented Programming Paradigm\\src\\Lab_Week13_01\\student.txt");
		Scanner kb = new Scanner(f);
		int cs=0;
		int it=0;
		while(kb.hasNext()) {
			int id=kb.nextInt();
			String fa=kb.next();
			String fname=kb.next();
			String lname=kb.next();
			if(fa.equals("CS")) {
				cs+=1;
			}else if(fa.equals("IT")) {
				it+=1;
			}
		}System.out.println("There are "+cs+" person in the Computer Science.");
		System.out.println("There are "+it+" person in the Information Technology.");
	}

}
