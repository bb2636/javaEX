package lambda;

import java.util.List;
import java.util.function.Predicate;

public class PredicatedDemo {
  public static void main(String[] args) {
    Predicate<String> isEmpty = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() == 0;  //0이면 true 0이 아니면 false 반환
      }
    };
    String s = "";
    if (s != null && isEmpty.test(s)) {
      System.out.println("빈 문자열");
    }

  }
}
