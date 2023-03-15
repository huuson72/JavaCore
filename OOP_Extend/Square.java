package OOP_Extend;

public class Square extends Rectangle{
  
   public Square() {
	   super();
   }

public Square(double side) {
	super(side, side);
}

public Square(String color, boolean filled, double side) {
	super(color, filled, side, side);
	
}
public void setSide(double side) {
	setWidth(side);
	setLength(side);
}
public String toString() {
    // TODO Auto-generated method stub
    return String.format("Squard[Rectangle[Shape[color=%s,fill = %s,w = %s,l=%f,Area = %f]]", getColor(),
        isFilled() ? "true:" : "false", getWidth(), getLength(),getArea());
  }


}
