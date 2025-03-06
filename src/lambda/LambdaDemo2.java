package lambda;

public class LambdaDemo2 {
  public static void main(String[] args) {
    PrintFunction p = new PrintFunction() {
      @Override
      public void printVar(String name, int i) {
        System.out.println(name + "=" + i);
      }
    };
    p.printVar("홍길동",3);

    //람다식
    PrintFunction p2 = (name, i) -> System.out.println(name+"="+i);
    p2.printVar("kim",5);
  }
}

@FunctionalInterface
interface PrintFunction {
  void printVar(String name, int i);
}
