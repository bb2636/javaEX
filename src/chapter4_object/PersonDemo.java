package chapter4_object;

public class PersonDemo {
  public static void main(String[] args) {
    Person p = new Person();
    p.setName("민국").setAge(21).sayHello();

    Person p1 = new Person();
    p1.setName("대한").setAge(21).sayHello();
  }
}
