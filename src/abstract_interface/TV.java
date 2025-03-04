package abstract_interface;

public class TV implements Controllable{
  @Override
  public void turnOn() {
    System.out.println("tv를 키다");
  }
  @Override
  public void turnOff() {
    System.out.println("tv를 끄다");
  }
  @Override
  public void repair() {
    System.out.println("tv 수리하기");
  }
  //static 인 reset 과 private 인 printInformation 은 오버라이딩 불가능
}
