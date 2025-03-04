package abstract_interface;

public class MovableDemo {
  public static void main(String[] args) {
    //자동형변환(upcasting)
    Movable m = new Car();
    m.move(3);

    //명시적 강제형변환(downcasting)
    Car car = (Car) m;
    car.move(5);
    car.show();
  }
}
