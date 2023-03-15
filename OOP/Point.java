package OOP;
public class Point {
int x,y;

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
//3 Phuong thuc overloading ..Qua tai ham khoi tao
public Point(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public Point() {
    this.x = 0;
    this.y = 0;
  }
public Point(Point p) {
    this.x = p.x;
    this.y = p.y;
  }
public double Distance() {
    double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    return d;
  }

  // Khoang cach tu d toi q
  public double Distance(Point q) {
    double d = Math.sqrt(Math.pow(x - q.x, 2) + Math.pow(y - q.y, 2));
    return d;
  }

  // Dung ham thu tuc static khong su dung huong doi tuong
  public static double Distance(Point p, Point q) {
    double d = Math.sqrt(Math.pow(p.x - q.x, 2) + Math.pow(p.y - q.y, 2));
    return d;
  }

  @Override
  public String toString() {
    return String.format("(%d ,%d)", x, y);
  }

}

