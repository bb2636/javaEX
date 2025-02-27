package chapter4_object;

public class BallDemo2 {
  public static void main(String[] args) {
    Ball myBall = new Ball();
    Ball yourBall = new Ball();
    System.out.println("myBall = " + myBall.radius);
    System.out.println("yourBall = " + yourBall.radius);

    myBall = yourBall;
    yourBall.radius = 10.0;
    System.out.println("myBall = " + myBall.radius);
    System.out.println("yourBall = " + yourBall.radius);
  }
}
