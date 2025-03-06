package exception_handle;

public class UncheckedDemo2 {
  public static void main(String[] args) {
    try {
      method1();
    } catch (ArithmeticException a) {
      System.out.println(a.getMessage());
    } catch (Exception e) {
      System.out.println("오류발생");
    }
  }
  static void method1() throws ArithmeticException, NullPointerException,IndexOutOfBoundsException,IllegalAccessError{
    method2();
  }
  static void method2() throws ArithmeticException, NullPointerException,IndexOutOfBoundsException,IllegalAccessError {
    int i = 1/1;
    throw new NullPointerException();
  }

}