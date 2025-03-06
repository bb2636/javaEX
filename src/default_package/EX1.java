package default_package;

import java.util.Objects;

public class EX1 {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if(c1.equals(c2)) {
      System.out.println("c1과 c2는 같다.");
    } else {
      System.out.println("c1과 c2는 다르다.");
    }
  }
}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object o) {
    if(o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;
    return this.hashCode() == circle.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius);
  }
}