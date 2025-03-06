package lambda;

public class LambdaDemo {
  public static void main(String[] args) {
//    Object obj = new AnyObject() {
//      int max (int a, int b) {
//        return a > b ? a : b;
//      }
//    };
    MyFunction m = new MyFunction() {
      @Override
      public int max(int a, int b) {
        return a > b ? a : b;
      }
    };
    System.out.println(m.max(3,5));

    MyFunction m2 = (int a, int b) -> a > b ? a : b;
    System.out.println(m2.max(3,5));
}
}

//함수형 인터페이스 - 하나의 추상 메서드만 가진 인터페이스
interface MyFunction {
  public abstract int max (int a, int b);
  //public abstract int min (int a, int b);
}
//class AnyObject {
//  class Anonymous{
//    int max (int a, int b) {
//      return a > b ? a : b;
//    }
//    // (a,b) -> a > b ? a : b
//  }
//}