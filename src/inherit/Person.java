package inherit;

public class Person {
  String name = "사람";

  void whoami() {
    System.out.println("사람입니다");
  }
}
class Student extends Person {
    int number = 7;
    void work() {
      System.out.println("공부하기");
    }
  }

class Worker extends Person {
  void work() {
    System.out.println("일하기");
  }
}