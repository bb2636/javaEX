package stream;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("abc","bvvv","cd","dddd","efff");
    Stream<String> s2 = s1.map(String::toUpperCase);
    Stream<Integer> s3 = s2.map(String::length); //길이 구해서 숫자로 변환
    Stream<String> ss1 = Stream.of("abc","bvvv","cd","dddd","efff");
    Stream<String>s4 = ss1.map(s -> s.substring(0,1));
    //중간 잘라서 문자열로 변환(앞자리 1개)
    s4.forEach(System.out::println);

    Stream<Integer> i1 = Stream.of(1,2,3,4,5);
    Stream<String> i2 = i1.map(i -> i + "");
    Stream<Integer> i3 = i2.map(Integer::parseInt);
    Stream<Integer> i4 = i3.map(i -> i * 10);
    i4.forEach(System.out::println);

    Stream<Integer> i11 = Stream.of(1,2,3,4,5);
    DoubleStream doubleStream = i11.mapToDouble(i -> (double) i);
    Stream<String> stringStream = doubleStream.mapToObj(d -> d+"");
    stringStream.forEach(System.out::println);
  }
}
