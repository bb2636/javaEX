package chapter4_object;

public class SingleTonDeml {
  public static void main(String[] args) {
    SingleTon s1 = SingleTon.getInstance();
    s1.method();
    SingleTon s2 = SingleTon.getInstance();
    s2.method();

    if(s1 == s2) {
      System.out.println("s1 s2 같은 객체");
    }

    Circle c1 = new Circle(10);
    Circle c2 = new Circle(10);
    if(c1.equals(c2)) {
      System.out.println("c1 c2같은 객체");
    } else {
      System.out.println("c1 c2 다른 객체");
    }
  }
}
