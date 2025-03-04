package abstract_interface;

public interface Myinterface {
  //상수 필드
  int Max = 10;
  //추상메서드
  void sayHello();
  //구현부가 있는 defaul 메서드(클래스로 상속 + 오버라이드 가능 > 다형성)
  default void myNameIs() {
    System.out.println("my name is myinterface");
  }
}
class NewClass implements Myinterface {
  @Override
  public void sayHello() {
    System.out.println("hello");
  }

//  @Override
//  public void myNameIs() {
//    System.out.println("my name is ~ ");
//  }
}

