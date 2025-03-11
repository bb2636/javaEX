package stream;

import java.util.stream.IntStream;

public class LazyDemo2 {
  public static void main(String[] args) {
    IntStream is = IntStream.rangeClosed(1, 5);
    is.filter( i -> {
      System.out.println("filter : " + i);
      return i % 2 == 0;  //1번째 중간연산
    }).map(x -> {
          System.out.println("map : " + x);
          return x * x; //2번째 중간연산
        })
        .forEach( x-> System.out.println("foreach : " + x));//최종연산
  }
}
