package abstract_interface;
import inherit.Vehicle;

public interface Movable {
  void move(int x);
}

class Car implements Movable {
  private int pos = 0;
  @Override
  public void move(int x) {
    pos += x;

  }
  public void show() {
    System.out.println("자동차는 "+ pos +"m 만큼 움직인다");
  }
}
