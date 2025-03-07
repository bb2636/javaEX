package collection_framwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> list = List.of("그렌저","소나타","아반떼","제네시스","소울");
    List<String> list2 = new ArrayList<>(list); //불변객체를 변경 가능하게 수정
    list2.add("k3");
    //list2.set(0,"뉴그렌저");
    list2.removeIf(s -> s.startsWith("소")); //해당 글자로 시작하는것 찾기
    System.out.println(list2);
    list2.forEach(s -> System.out.println(s));
    list2.forEach(System.out::println);
    list2.replaceAll(s -> "뉴" + s);
    list2.forEach(System.out::println);
    list2.clear();
    if (list2.isEmpty()) {
      System.out.println("리스트가 빔");
    }
  }
}
