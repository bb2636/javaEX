package abstract_interface;

public class ControllableDemo {
  public static void main(String[] args) {
    Controllable c = new Computer();
    c.turnOn(); c.turnOff(); c.repair();

    Controllable n = new Notebook();
    n.turnOn(); n.turnOff(); n.repair();

    Controllable t = new TV();
    t.turnOn(); t.turnOff(); t.repair();

    System.out.println("-----------");
    Controllable[] controllables = { new TV(), new Computer(), new Notebook() };
    for( Controllable Controllable : controllables) {
      Controllable.turnOn();
      Controllable.turnOff();
      Controllable.repair();
    }
  }
}
