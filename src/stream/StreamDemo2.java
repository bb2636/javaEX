package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo2 {
  public static void main(String[] args) {
    int[] iarr = {1,2,3,4,5}; //배열 > 공간적 집합체
    IntStream stream = Arrays.stream(iarr);//intstream 시간적 집합체로 바꿈
    System.out.print(stream.sum()+":");
    stream = Arrays.stream(iarr); //한번 사용한 뒤 또 사용하려면 다시 선언해야함
    System.out.print(stream.average());
    
    double[] darr = {1.0, 2.0, 3.0, 4.0};
    DoubleStream stream1 = Arrays.stream(darr); //doublestream
    long[] larr = {1L, 2L, 3L, 4L};
    LongStream stream2 = Arrays.stream(larr); //longstream

    List<Integer> ilist = Arrays.asList(1,2,3,4,5); //리스트 > 공간적
    Stream<Integer> st1 = ilist.stream(); //시간적
    
    
    String[] sarr = {"a","b","c","d","e"};
    Stream<String> st2 = Arrays.stream(sarr);

    Stream<Integer> integerStream = Stream.of(1,2,3,4,5); //객체 스트릠
    IntStream.of(1, 2, 3, 4);
  }
}
