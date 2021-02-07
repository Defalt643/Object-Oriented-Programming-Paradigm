package Lab_Week4;

public class FinalExam extends GradeActivity{
	public int numQuestion,numMissed;
	public double pointEach;
	public FinalExam(int numQuestion,int numMissed) {
		this.numQuestion=numQuestion;
		this.numMissed=numMissed;
		pointEach=100/numQuestion;
		score=(numQuestion*pointEach)-(numMissed*pointEach);
	}public double getPointEach(){
		return pointEach;
	}public int getnumMissed() {
		return numMissed;
	}
}