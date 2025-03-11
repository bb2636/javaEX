package stream;

import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    Stream.of("a1","b1","b2","c1","c2","c3")
        .filter(s-> s.startsWith("c"))
        .skip(1) //첫번째만 스킵함 2>>2번째까지 스킵(1,2 스킵 3 통과)
        .forEach(Util::print);

//    print(T t)  System.out.print(t + " "); >> c2 c3
//    printWithParenthesis(T t) System.out.print("(" + t + ") "); >> (c2) (C3)
  }
}
