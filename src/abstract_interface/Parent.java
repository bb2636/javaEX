package abstract_interface;

public class Parent { //외부클래스
  void method1() {
    System.out.println("부모");
  }
  void method2() {
    System.out.println("모부");
  }
}
class Parent1 {
  class OnlyOnce extends Parent {
    @Override
    void method1(){
      System.out.println("한 번만 호출됩니다.");
    }
  }
  void method1(){
    System.out.println("부모입니다.");
  }
}