package OOP_Extend;

public class Main {
public static void main(String[] args) {
	Shape s = new Shape("blue",false);
	Circle c = new Circle(7,"blue",false);
	Rectangle r = new Rectangle("Red",true,7,5);
	Square sq = new Square("Yellow",true,7);
	
	System.out.println(s.toString());
	System.out.println(c.toString());
	System.out.println(r.toString());
	System.out.println(r.getArea());
	System.out.println(sq.toString());
  System.out.println();
}
}
