package default_package;

import java.util.Objects;

public class EX1_1 {
  public static void main(String[] args) {
    Person p1 = new Person("111111","홍길동");
    Person p2 = new Person("111111","손흥민");
    Person p3 = new Person("123456","손흥민");

  if (p1.equals(p2)) {
    System.out.println("p1과 p2는 같다");
  } else {
    System.out.println("p1과 p2는 다르다");
  }
    if (p2.equals(p3)) {
      System.out.println("p2과 p3는 같다");
    } else {
      System.out.println("p2과 p3는 다르다");
    }
  }
}
class Person {
  String number;
  String name;

  public Person(String number, String name) {
    this.number = number;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if(o == null || getClass() != o.getClass()) return false;
    Person p = (Person) o;
    return this.hashCode() == p.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(number,name);
  }
}
