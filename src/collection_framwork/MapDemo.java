package collection_framwork;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits = null;
    try {
      fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
      //k값은 중복되면 안됨(유일값)
    } catch (IllegalAccessError e) {
      System.out.println(e.getLocalizedMessage());
    } finally {
      try {
        System.out.println(fruits.size() + " 종류의 과일이 있습니다");
      } catch (NullPointerException e) {
        System.out.println("자료 생성 과정에서 문제 발생");
      }
    }
    System.out.println(fruits);

    for (String key : fruits.keySet()) {
      System.out.println(key + "가" + fruits.get(key) + " 개 있다");
    }

    String fruit = "배";
    if (fruits.containsKey(fruit)) {
      System.out.println(fruit + "가" + fruits.get(fruit) + " 개 있다");
    }//flase 이면 실행되지 않음 > fruits에 배가 없음
    else {
      System.out.println(fruit + " 가 없습니다");
    }
    fruits.forEach((key, value) -> System.out.println(key + "(" + value + ")"));
    //fruits.replaceAll((key, v1) -> v1 * 10); 수정불가
    //fruits.put("사과",50); 수정불가

    Map<String, Integer> map = null;
    map = new HashMap<>(fruits);
    map.put("사과", 50);
    System.out.println(fruits);
    System.out.println(map);
    map.remove("사과");
    System.out.println(map);

  }
}
