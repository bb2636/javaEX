package inherit.chapter6;

public class InheritDemo {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.findArea();

    Ball b = new Ball("yellow");
    b.findArea();
    b.findVolume();
  }
}
