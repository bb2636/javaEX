package collection_framwork;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도","수박","사과","딸기","망고"};
    List<String> fruitsList = Arrays.asList(fruits);
    Map<Fruit, Integer> fruitsMap = new HashMap<>();
    //collections.sort(fruits); 배열 사용 불가능
    //collections.sort(fruitsMap); map 구현체 사용 불가
    Collections.sort(fruitsList);
    System.out.println(fruitsList);

    Collections.sort(fruitsList, (o1, o2) -> o2.compareTo(o1));
    System.out.println(fruitsList);
    //같은 내용
    Collections.sort(fruitsList,Collections.reverseOrder());
    System.out.println(fruitsList);

    Collections.reverse(fruitsList); //순서 뒤집기
    System.out.println(fruitsList);

    Collections.rotate(fruitsList,1); //한칸씩 밀기
    System.out.println(fruitsList);

    Collections.shuffle(fruitsList);  //섞기
    System.out.println(fruitsList);
  }
}
