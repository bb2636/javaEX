package chapter4_object;

public class Circle {
  public Circle(double radius) {
    if (radius <= 0) {
      System.out.println("반지름은 0보다 커야 합니다");
    } else {
      this.radius = radius;
    }
  }
  //인스턴스 멤버
  //필드
  private double radius;
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    if (radius <= 0) {
      System.out.println("반지름은 0보다 커야 합니다");
    } else {
      this.radius = radius;
    }
  }
  //메서드
  double findArea() {
    final double PI = 3.141592653589793;
    return PI * radius * radius;
  }
  void show() {
    System.out.printf("원의 반지름은 %f이고 넓이는 %f 입니다", radius, findArea());
  }
}
