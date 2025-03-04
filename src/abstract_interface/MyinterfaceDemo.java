package abstract_interface;

public class MyinterfaceDemo {
  public static void main(String[] args) {
    Myclass m = new Myclass();
    System.out.println(m.myClassInt);
    m.sayHello();
    System.out.println(Myinterface.Max);
    System.out.println(Yourinterface.Min); //상속받은 max도 사용 가능

    Myclass2 m2 = new Myclass2();
    m2.sayHello();
    NewClass nc = new NewClass();
    nc.myNameIs();
  }
}
