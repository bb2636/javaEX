package abstract_interface;

public interface Yourinterface extends Myinterface {
  int Min = 0;
  void sayHello2();
}

//클래스는 인터페이스를 구현
class Myclass implements Myinterface{
  int myClassInt = 1;
  @Override
  public void sayHello() {

  }
}
class Myclass2 implements Myinterface {
  @Override
  public void sayHello() {
    System.out.println("hello");
  }
}

class Yourclass implements Yourinterface {
  int yourClassInt = 10;
  @Override
  public void sayHello2() {
    System.out.println("hello2");
  }

  @Override
  public void sayHello() {
    System.out.println("hello");
  }
}
