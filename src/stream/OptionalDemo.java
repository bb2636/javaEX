package stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class OptionalDemo {
  public static void main(String[] args) {
//    System.out.println(divide(3.0, 0.0).isEmpty());
//    OptionalDouble divide = divide(3.0,1.0);
      OptionalInt divide = divide(3,0);
      if(divide.isEmpty()) {
        System.out.println("0으로 나눌 수 없음");
      }
      if (divide.isPresent()) { //존재여부 확인
        System.out.println(divide.getAsInt()); //optional 언박싱
      }

    Optional<String> result = check(null);
        if(result.isEmpty()) {
          System.out.println("빈값");
        }
        if (result.isPresent()) {
          System.out.println(result.get()); //optional 언박싱
        }
  }

//  public static OptionalDouble divide(double x, double y) {
//    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x/y);
//  }
  public static OptionalInt divide(int x, int y) {
    return y == 0? OptionalInt.empty() : OptionalInt.of(x/y);
  }
  public static Optional<String> check(String s) {
    //return s == null ? Optional.empty() : Optional.of(s.toLowerCase()); //소문자로 반환
    return Optional.ofNullable(s); //null인 경우 empty반환
  }
}
