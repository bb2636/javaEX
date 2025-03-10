package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo3 {
  public static void main(String[] args) {
    IntStream iterate = IntStream.iterate(0,x->x+1);
    iterate.limit(2).forEach(System.out::println); //limit - 느긋한 연산 (중간연산)
    //iterate.forEach(System.out::println); //1씩 증가하는 무한루프 > 조급한 연산(최종연산)
    Random r = new Random();
    IntStream ints = r.ints(); //정해진 숫자가 없어 무한 루프
    ints.limit(4).forEach(System.out::println);
    //ints.forEach(x -> System.out.println(x));

    Stream<Integer> generate = Stream.generate(() -> new Random().nextInt(10));//0~9까지 랜덤한 숫자 무한루프
    //generate.forEach(System.out::println);
    generate.limit(5).forEach(System.out::println);

    IntStream range = IntStream.range(1, 10);
    range.forEach(System.out::println); //1~10까지 한번씩 찍음
    LongStream ra1 = LongStream.range(1,10);
    ra1.forEach(System.out::println);
    LongStream ra2 = LongStream.range(1,10);
    ra2.forEach(System.out::println);
  }
}
