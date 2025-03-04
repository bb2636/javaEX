package abstract_interface;

public class ControllableDemo2 {
  public static void main(String[] args) {
    test(new TV());
    test(new Notebook());
    test(new Computer());
  }
  public static void test(Controllable con) {
    con.turnOn();
    con.turnOff();
    con.repair();
  }
}
