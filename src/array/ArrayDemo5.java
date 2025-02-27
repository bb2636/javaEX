package array;

import chapter4_object.Ball;

public class ArrayDemo5 {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];
    balls[0] = new Ball(5);
    balls[1] = new Ball(10);

    System.out.println(balls[0].getVolume());
    for (Ball ball : balls) {
      System.out.println(ball);
    }
  }
}
