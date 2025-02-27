package array;

class Circle {

  //생성자(원 반지름 초기화)
  public Circle(double radius) {
    this.radius = radius;
  }

  //필드 - 반지름
  double radius;

  //메서드
  public double getRadius() {
    return radius;
    //반지름 구하기
  }
  double findArea() {
    return 3.14 * radius * radius;
    //원의 넓이
  }

  @Override
  public String toString() {
    //return "반지름이 " + radius + "이고 넓이가 " + findArea() + "인 원입니다";
    return String.format("원의 반지름과 넓이 : %1f , %2f \n", radius, findArea());
  }
}
