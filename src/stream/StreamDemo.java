package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    //스트림 적용 전 예제
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      int num = r.nextInt(30); //0~29
      System.out.println(num);
      list.add(num);
    }
    System.out.println(list);


    List<Integer> list2 = new ArrayList<>();

    for (Integer i : list) {
      if(i > 10) {
        list2.add(i);
      }
    }
    Collections.sort(list2);
    System.out.println(list2);
    list.stream()
        //Predicate 함수형 인터페이스 익명 구현체
        .filter(i -> i >10)
        .sorted()
        //consumer 함수형 인터페이스 익명 구현체
        .forEach(System.out::println);
  }
}
