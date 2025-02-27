package array;

public class ArrayDemo6 {
  public static void main(String[] args) {
    Circle[] circles = new Circle[5];

    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle(i + 1.0);
    }
    for(Circle circle : circles) {
//      System.out.println("원의 반지름 = " + circle.getRadius());
//      System.out.println("원의 넓이 = " + circle.findArea());
      System.out.println(circle);
    }
  }
}
