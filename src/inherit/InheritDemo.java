package inherit;

public class InheritDemo {
  public static void main(String[] args) {
    Eagle e = new Eagle();
    Tiger t = new Tiger();
    GoldFish g = new GoldFish();
    e.sleep();
    g.eat();
  }
}
class Animal {
  String eye, mouth;
  void eat(){
    System.out.println("먹다");
  }
  void sleep(){
    System.out.println("자다");
  }
}
class Eagle extends Animal {
  String wing;
  void fly(){}
}
class Tiger extends Animal {
  String  leg;
  void run(){}
}
class GoldFish extends Animal {
  String fin;
  void swim(){}
}
