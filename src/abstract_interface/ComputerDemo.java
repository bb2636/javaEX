package abstract_interface;

public class ComputerDemo {
  public static void main(String[] args) {
    Computer c = new Computer();
    Notebook n = new Notebook();

    c.turnOn();
    c.turnOff();
    c.repair();

    n.turnOn();
    n.turnOff();
    n.repair();
    n.inMyBag();
    Controllable.reset();
  }
}
