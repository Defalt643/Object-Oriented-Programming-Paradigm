package Lab_Week13_02;
import java.util.Scanner;
import java.io.*;
public class Tester02 {

	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\ming\\eclipse-workspace\\Object-Oriented Programming Paradigm\\src\\Lab_Week13_02\\score.txt");
		Scanner kb = new Scanner(f);
		
		while(kb.hasNext()) {
			String id =kb.next();
			int score=kb.nextInt();
			if(score >=60) {
				System.out.println("ID : "+id+" Grade : S");
			}else {
				System.out.println("ID : "+id+" Grade : U");
			}
		}

	}

}
