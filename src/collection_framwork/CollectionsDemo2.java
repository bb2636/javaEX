package collection_framwork;

import java.util.*;

public class CollectionsDemo2 {
  public static void main(String[] args) {
    //중복이 허용됨
    List<String> list1 = List.of("포도", "수박", "사과", "망고", "딸기","포도", "수박", "사과", "망고", "딸기");
    Set<String> set = new HashSet<>(list1);
    System.out.println(set); //중복된 값 빠짐 순서도 바뀜
    List<String> list2 = new ArrayList<>(set);
    list2.set(0, "키위"); //수정가능
    System.out.println(list2);
    for (String s : list2) {
      System.out.println(s+"가 "+ Collections.frequency(list2,s) + "번 존재함");
    }

  }
}
