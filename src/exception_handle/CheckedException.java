package exception_handle;

import java.io.IOException;
import java.io.InterruptedIOException;

public class CheckedException {
  public static void main(String[] args) {
    try{
      method1();
    } catch (ClassNotFoundException e) {
      System.out.println("클래스 사용 불가");
    } catch (IOException i) {
      System.out.println(i.getMessage());
    }
  }

  static void method1()
      throws ClassNotFoundException, IOException,
      IndexOutOfBoundsException, NullPointerException {
    method2();
  }
  static void method2() throws ClassNotFoundException, IndexOutOfBoundsException, NullPointerException {
    Class cla = Class.forName("java.lang.String");
  }
}
