package inherit.ex;

public class EX4 {
  public void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();

    Parent p2 = new Child();
    System.out.println(p2.name);
    p2.print();
  }
}

  class Parent {
    String name = "영조";

    void print() {
      System.out.printf("이름 : %s", name);
    }
  }

  class Child extends Parent {
    String name = "사도세자";

    void print() {
      System.out.printf("이름 : %s", name);
    }
  }
