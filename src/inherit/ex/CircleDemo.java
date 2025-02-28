package inherit.ex;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c = new Circle(5);
    c.show();

    Circle c1 = new ColoredCircle(10,"빨간색");
    c1.show();
  }
}
