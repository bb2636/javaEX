public class OverloadingDemo {
  public static void main(String[] args) {
    addNumbers(1,2);
    addNumbers(1,2,3);
    addNumbers(1,2,3,4);
    addNumbers(1,2,3,4,5);
    addNumbers(1000L,2000L);
    addNumbers(1.0,2.0);
  }

  //가변개수의 매개변수 > ...
  //타입이 다른 메서드를 여러개 만들 수 있음 > 메서드 오버로딩
  private static void addNumbers(int... numbers) {
    int result = 0;
    for (int number : numbers) {
      result += number;
    }
    System.out.println(result);
  }
  private static void addNumbers(long... numbers){
    long result = 0;
    for (long number : numbers) {
      result += number;
    }
    System.out.println(result);
  }
  private static void addNumbers(double... numbers){
    double result = 0;
    for (double number : numbers) {
      result += number;
    }
    System.out.println(result);
  }
}

