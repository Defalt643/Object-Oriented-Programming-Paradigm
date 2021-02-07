package Lab_Week2;

public class Line {
	Point p1;
	Point p2;
	public Line(Point p1,Point p2) {
		this.p1=p1;
		this.p2=p2;
	}public Line(int x1,int y1,int x2,int y2){
		this.p1 = new Point(x1,y2);
		this.p2 = new Point(x2,y2);
	}public String toString() {
		return "Line [p1"+p1+"p2"+p2+"]";
	}public Point getP1() {
		return p1;
	}public Point getP2() {
		return p2;
	}
}