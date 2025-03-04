package abstract_interface;

public class InterfaceDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    tv.repair();
    Controllable.reset(); //인터페이스 명으로 호출 가능

    RemoteControllable rc = new RemoteController();
    rc.remoteOn();
    rc.remoteOff();

    Computer c = new Computer();
    c.turnOn();
    c.turnOff();
    c.repair();

  }
}
