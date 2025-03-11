package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo3 {
  public static void main(String[] args) {
    IntStream is = IntStream.generate(
        () -> new Random().nextInt(10)); //0~10 사이 정수 무한 생성
    is.filter( i -> {
          System.out.println("filter : " + i);
          return i % 2 == 0;  //1번째 중간연산
        })
        .limit(3)
        .map(x -> {
          System.out.println("map : " + x);
          return x * x; //2번째 중간연산
        })
        .forEach( x-> System.out.println("foreach : " + x));//최종연산
  }
}