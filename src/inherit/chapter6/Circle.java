package inherit.chapter6;

public class Circle {
  public double radius =10.0;
  public double findRadius() {
    return radius;
  }
  public void findArea() {
    System.out.println("원의 넓이 = " + Math.PI * radius * radius);
  }
}
