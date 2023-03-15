package OOP_Abstract;

public class Circle extends Shape{
	public Circle(String color,boolean filled) {
		super(color,filled);
	}
	@Override
	double getArea() {
		return 0;
	}

	@Override
	double getPerimeter() {
		return 0;
	}
  @Override
  public String toString() {
  // TODO Auto-generated method stub
  return String.format("Shape[Circle[Color: %s ,filled = %s]]", color,filled?"true":"false");
  }
	
}