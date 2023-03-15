package OOP_Abstract;

public class Square extends Rectangle {
  public Square(String color, boolean filled) {
    // TODO Auto-generated constructor stub
    super(color, filled);
  }

  double getArea() {
    return super.getArea();
  }
@Override
public String toString() {
  // TODO Auto-generated method stub
  return String.format("Shape[ Square[Color: %s , filled = %s]]",color,filled?"true":"false");
}
}

