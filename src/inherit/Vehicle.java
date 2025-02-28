package inherit;

public class Vehicle {
  String name = "탈것";
  void whoami() {
    System.out.println("탈것이다");
  }
  static void move() {
    System.out.println("이동하다");
  }
}
class Car extends Vehicle {
  String name = "자동차";
  @Override
  void whoami() {
    System.out.println("자동차다");
  }
  static void move() {
    System.out.println("달리다");
  }
}
class SportsCar extends Car {
  @Override
  void whoami(){
    System.out.println("스포츠카이다");
  }
}