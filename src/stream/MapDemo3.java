package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo3 {
  public static void main(String[] args) {
    String s = "hello java";
    String s1 = "hi, my name is";
    String[] s2 = s.split(" ");
    String[] s3 = s1.split(" ");

    System.out.println(s2.length);
    System.out.println(s3.length);

    List<String> list1 = List.of("안녕, 자바", "잘 가, C++");
    Stream<String> list2 = list1.stream();
    Stream<String> stringStream = list2.flatMap(sss -> Arrays.stream(sss.split(" ")));
    stringStream.forEach(Util::print);
  }
}
