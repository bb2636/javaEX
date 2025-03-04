package abstract_interface;

public class MemberDemo {
  class Eagle extends Bird {
    @Override
    void move() {
      System.out.println("독수리 fly");
    }
    void sound() {
      System.out.println("eeee");
    }
  }
  Eagle e = new Eagle();

  public static void main(String[] args) {
    MemberDemo m = new MemberDemo(); //eagle의 외부(부모)
    m.e.move(); //부모 먼저 접근 >  자식 접근
    m.e.sound();
  }
}
