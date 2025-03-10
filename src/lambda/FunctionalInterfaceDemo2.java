package lambda;

public class FunctionalInterfaceDemo2 {
  public static void main(String[] args) {
    Calculable cal = new Calculable() {
      @Override
      public void calculate(int x, int y) {
        int result = x + y;
        System.out.println(result);
      }
    };
    Calculable cal2 = (x, y) -> {
      int res = x + y;
      System.out.println(res);
    };
    cal2.calculate(3,6);
  }
}

@FunctionalInterface
interface Calculable {
  void calculate(int x, int y);
}
