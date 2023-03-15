package OOP_Abstract;

public abstract class Shape {
  protected String color;
  protected boolean filled ;
  
  public Shape(String color,boolean filled) {
    super();
    this.color = color;
    this.filled = filled;
  }
  public Shape() {
    color = "red";
    filled = true;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  abstract double getArea();
  abstract double getPerimeter();
  @Override
    public String toString() {
      // TODO Auto-generated method stub
      return String.format("Shape[color=%s,fill =%s", color,filled?"true":"false");
    }
  }
  