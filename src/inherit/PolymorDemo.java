package inherit;

public class PolymorDemo {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Vehicle();
    vehicles[1] = new Car();
    vehicles[2] = new SportsCar();

    for( Vehicle v : vehicles) {
      v.whoami();
    }
  }
}
