package Lab_Week2;

public class Rectangle {
	Point p1;
	int width,height;
	public Rectangle(Point p1,int width,int height) {
		this.p1=p1;
		this.width=width;
		this.height=height;
	}public Rectangle(int x1,int y1,int width,int height){
		this.p1=new Point(x1,y1);
		this.width=width;
		this.height=height;
	}public int getWidth() {
		return width;
	}public int getHeight() {
		return height;
	}public Point getPoint() {
		return p1;
	}public String toString() {
		return "Rectangle[x="+p1.x+",y="+p1.y+",width="+width+",height="+height+"]";
	}public boolean contains(int x,int y) {
			if (p1.x == x && p1.y == y) {
				return true;
			} else {
				if (p1.x + width == x && p1.y == y) {
					return true;
				} else {
					if (p1.x + width == x && p1.y + height == y) {
						return true;
					} else {
						if (p1.x == x && p1.y + height == y) {
							return true;
						} else {
							return false;
						}
					}
				}
			}	
	}public boolean contains(Point p) {
		return contains(p.x,p.y);
	}
}