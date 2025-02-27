package chapter4_object.circle;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    System.out.println(c1.radius);
    System.out.println(c1.color);
    System.out.printf("총 %d 개의 공이 있습니다 \n", c1.numOfCircle);

    Circle c2 = new Circle(5.0);
    System.out.println(c2.radius);
    System.out.println(c2.color);
    System.out.printf("총 %d 개의 공이 있습니다 \n", c2.numOfCircle);

    Circle c3 = new Circle("노랑");
    System.out.println(c3.radius);
    System.out.println(c3.color);
    System.out.printf("총 %d 개의 공이 있습니다 \n", c3.numOfCircle);

    Circle c4 = new Circle();
    System.out.println(c4.radius);
    System.out.println(c4.color);
    System.out.printf("총 %d 개의 공이 있습니다 \n", c4.numOfCircle);
  }
}
