package chapter4_object;

public class BallDemo {
  public static void main(String[] args) {
    Ball ball = new Ball();
    Ball.print();
    System.out.println("반지름 = " + ball.radius);
    System.out.println("공의 부피 = " + ball.getVolume());

    Ball b = new Ball(5.0);
    System.out.println("b = " + b.radius);
  }
}
