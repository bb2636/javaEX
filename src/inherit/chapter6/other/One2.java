package inherit.chapter6.other;

import inherit.chapter6.One;

public class One2 extends One {
  void print() {
    //System.out.println(secret);  private라 사용 불가능
    //System.out.println(roomate);  패키지가 달라서 사용 불가능
    System.out.println(child);
    System.out.println(anybody);
  }
}
