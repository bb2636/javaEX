package collection_framwork;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new Hashtable<>();
    Fruit apple = new Fruit("사과");
    fruits.put(apple, 5);
    fruits.put(new Fruit("바나나"), 3);
    fruits.put(new Fruit("바나나"), 30);
    fruits.put(new Fruit("사과"), 50);
    fruits.put(new Fruit("딸기"), 2);
    //hashTblae은 null값을 가질 수 없음

    fruits.get(apple);
    System.out.println(fruits);
  }
}
