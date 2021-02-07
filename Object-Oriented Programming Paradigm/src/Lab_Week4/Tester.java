package Lab_Week4;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.printf("Enter score : ","\n");
		int score = kb.nextInt();
		GradeActivity grade = new GradeActivity(score);
		System.out.println("Grade : "+grade.getGrade());
		System.out.printf("Enter number of question : ","\n");
		int question = kb.nextInt();
		System.out.printf("Enter number of missed answer : ","\n");
		int missed = kb.nextInt();
		FinalExam f1 = new FinalExam(question,missed);
		System.out.println("Score : "+f1.getScore());
		System.out.println("Grade : "+f1.getGrade());
	}
}