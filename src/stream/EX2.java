package stream;

import java.util.Arrays;
import java.util.List;

public class EX2 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "This is a java book",
        "Lambda Expressions",
        "Java8 supports lambda expressions"
    );
    list.stream().filter(a -> a.toLowerCase().contains("java")).forEach(System.out::println);

    List<Member> list1 = Arrays.asList(
        new Member("홍길동", 30),
        new Member("신용권", 40),
        new Member("감자바", 26)
    );
//    double avg = list.stream().mapToInt(Member::getAge).average().getAsDouble();
//    System.out.println("평균 나이: " + avg);
  }
}

