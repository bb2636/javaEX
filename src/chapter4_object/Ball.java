package chapter4_object;

public class Ball {
  //생성자 constructor
  public Ball() {
    //기본 생성자
  }
  public Ball(double r) {
    this.radius = r;
  }
  //필드 (변수)
  public double radius;
  //메서드 (동작)
  public double getVolume() {
    return (double) 4 / 3 * 3.14 * radius * radius * radius;
  }
  static void print(){
    System.out.println("ball");
  }

  @Override
  public String toString() {
    return "반지름이 " + radius + " 인 원입니다";
  }
}
