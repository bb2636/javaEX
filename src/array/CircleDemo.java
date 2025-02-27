package array;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
    zero(c1);
    System.out.println(c1);

    Circle c2 = new Circle(10);
    zero(c2.radius);
    System.out.println(c2);
  }
  static void zero(Circle c) {
    c.radius = 0.0;
  }
  static void zero(double radius) {
    radius = 0.0;
  }
}
