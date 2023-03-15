package OOP_Extend;

public class Rectangle extends Shape {
	  private double width, length;

	  public Rectangle() {
	    super();
	    width = length = 1;
	  }

	  public Rectangle(double width, double length) {
	    super();
	    this.width = width;
	    this.length = length;

	  }

	  public Rectangle(String color, boolean filled, double width, double length) {
	    super(color, filled);
	    this.width = width;
	    this.length = length;
	  }

	  public double getWidth() {
	    return width;
	  }

	  public void setWidth(double width) {
	    this.width = width;
	  }

	  public double getLength() {
	    return length;
	  }

	  public void setLength(double length) {
	    this.length = length;
	  }

	  public double getArea() {
	    return width * length;

	  }

	  @Override
	  public String toString() {
	    // TODO Auto-generated method stub
	    return String.format("Rectangle[w=%f,l = %f,c=%s,f=%s]", width, length, getColor(), isFilled() ? "true" : "false");
	  }

	}
