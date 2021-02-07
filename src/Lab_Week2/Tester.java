package Lab_Week2;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Point p1 = new Point(1,1);
		Point p2 = new Point(5,5);
		
		System.out.println("Point "+p1.toString());
		System.out.println("Point "+p2.toString());
		System.out.printf("Distance from p1 to original = "+"%.2f\n",p1.distanceFromOrigin());
		System.out.printf("Distance from p2 to original = "+"%.2f\n",p2.distanceFromOrigin());
		System.out.printf("Distance from p1 to p2 = "+"%.2f\n",p1.distance(p2));
		Line l1= new Line(p1,p2);
		System.out.println(l1.toString());
		System.out.println("Line [p1"+p1.toString()+" p2"+p2.toString()+"]");
		p1.setLocation(5, 2);
		Rectangle r1 =new Rectangle(p1,7,3);
		System.out.println("Rectangle[x="+p1.getX()+",y="+p1.getY()+",width="+r1.getWidth()+",height="+r1.getHeight()+"]");
		Rectangle r2 =new Rectangle(13,27,2,42);
		System.out.println(r2.toString());
		System.out.print("Enter position of (x,y) : ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		System.out.println("This point is in rectangle? : "+r1.contains(a,b));
		System.out.print("Enter position of point : ");
		int c = kb.nextInt();
		int d = kb.nextInt();
		Point p3 = new Point(c,d);
		System.out.println("This point is in rectangle? : "+r2.contains(p3));
	}

}