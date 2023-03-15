package OOP_Extend;

public class Circle extends Shape {
private double radius;

public Circle() {
	super();
	radius = 1.0;
}
public Circle(double radius) {
	this.radius = radius;
}
public Circle(double radius,String color,boolean filled) {
	super(color,filled);
	this.radius = radius;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
double getArea() {
	return Math.PI * radius * radius;
}
double getPerimeter() {
	return Math.PI * radius * 2;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Shape[Circle[color = %s,filled = %s],radius = %f]", getColor(),isFilled()?"true":"false",getRadius());
	}

}
