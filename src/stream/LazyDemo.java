package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1,5); //1,2,3,4,5

    IntStream filterS = intStream.filter(i -> i % 2 == 0);//짝수만 거르기
    IntStream mapStream = filterS.map(x -> x * x);
    mapStream.forEach(System.out::println);

    //위에꺼 가독성 높이기
    IntStream.rangeClosed(1,5)
        .filter(i -> i%2 == 0)
        .map(x -> x*x)
        .forEach(System.out::println);

    //무한루트를(0~10까지 정수) 홀수만 > 3개만 한정 > 2배한 결과 출력
    IntStream.generate(() -> new Random().nextInt(10))
            .filter(i -> i % 2 == 1)
            .limit(3)
            .map(x -> x *2)
            .forEach(System.out::println);
  }
}
