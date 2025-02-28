package inherit.ex;

public class Circle {
  int radius;

  void show() {
    System.out.println("반지름이 " + radius + "인 원이다");
  }
  Circle(int radius) {
    this.radius = radius;
  }
}
class ColoredCircle extends Circle{
  String color;

  @Override
  void show() {
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다");
  }

  ColoredCircle(int radius, String color) {
    super(radius);
    this.color = color;

  }
}
