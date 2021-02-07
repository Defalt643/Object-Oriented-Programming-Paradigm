package Lab_Week4;

public class GradeActivity {
	public double score;
	public GradeActivity() {
		
	}public GradeActivity(double score) {
		this.score=score;
	}
	public char getGrade() {
		if(score>89) {
			return 'A';
		}else if(score>79) {
			return 'B';
		}else if(score>69) {
			return 'C';
		}else if(score>59) {
			return 'D';
		}else {
			return 'F';
		}
	}public double getScore() {
		return score;
	}
}