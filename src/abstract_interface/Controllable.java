package abstract_interface;

public interface Controllable {
  //상속 후 필수로 구현하는 메서드 - abstract
  abstract void turnOn();
  abstract void turnOff();

  //기능이 미리 구현되어 있는 경우 - 오버라이딩 가능
  default void repair() {
    System.out.println("수리하기");
  }
  //기능이 미리 구현되어 있는 경우 - 오버라이딩 뷸가능
  static void reset() {
    System.out.println("초기화함");
  }
  //인터페이스 내부에서만 사용 / 구현 상속 대상 아님
  private void printInformation(String information) {
    System.out.println(information);
  }
}
