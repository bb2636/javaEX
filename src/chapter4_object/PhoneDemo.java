package chapter4_object;

class Phone {
  String model;
  int value;
  void print() {
    System.out.println(value + "만원 짜리 " + model + "제품");
  }
}

public class PhoneDemo {
  public static void main(String[] args) {
    Phone my = new Phone();
    my.model = "갤럭시";
    my.value = 100;
    my.print();

    Phone you = new Phone();
    you.model = "아이폰";
    you.value = 10;
    you.print();
  }
}
