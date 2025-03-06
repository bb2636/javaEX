package lambda;

public class LambdaDemo3 {
  public static void main(String[] args) {
    SquareFunction s = new SquareFunction() {
      @Override
      public int square(int x) {
        return x * x;
      }
    };
    SquareFunction s1 = x -> x * x;
  }
}
@FunctionalInterface
interface SquareFunction {
  int square(int x);
}
