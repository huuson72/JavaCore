package OOP_Abstract;

public class Rectangle extends Shape{
  protected double length,width;
	public Rectangle(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color, boolean filled, double length, double width) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double getArea() {
	  
		return length * width;
		
	}
  

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
  @Override
  public String toString() {
  // TODO Auto-generated method stub
  return String.format("Shape[Rectangle[c=%s,f=%s]]", getColor(), filled ? "true" : "false");
  }

}
