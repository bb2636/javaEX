package inherit;

public class VehicleDemo {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    System.out.println(v1.name);
    v1.whoami();
    Vehicle.move();
    v1.move();

    Vehicle v = new Car();
    System.out.println(v.name);
    v.whoami();
    Vehicle.move();
    Car c = (Car) v;
    c.move();
  }
}
