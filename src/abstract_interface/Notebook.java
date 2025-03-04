package abstract_interface;

public class Notebook extends Computer implements Portable{

  @Override
  public void inMyBag() {
    System.out.println("notebook is in my bag");
  }

  @Override
  public void turnOn() {
    System.out.println("노트북을 켜다");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북을 끄다");
  }

  @Override
  public void repair() {
    System.out.println("노트북을 수리하다");
  }
}
