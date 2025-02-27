package chapter4_object;

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    circle.setRadius(1.0);
    System.out.println("get" + circle.getRadius());
    //System.out.println(chapter4_object.circle.radius);
    System.out.println(circle.findArea());
    circle.show();
  }
}
