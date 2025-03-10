package collection_framwork;

import java.util.*;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();
    fruits.put(new Fruit("사과"),5);
    fruits.put(new Fruit("바나나"),3);
    fruits.put(new Fruit("바나나"),30);
    fruits.put(new Fruit("사과"),50);
    //중복된 이름에 값이 다를 경우 기존값에서 업데이트 됨(수정)
    fruits.put(new Fruit("딸기"),2);
    System.out.println(fruits);

    Collection<Integer> values = fruits.values();
    for (Integer value : values) {
      System.out.println(value);
    }
  }
}

class Fruit {
  String name;

  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Fruit[" + name + ']';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Fruit fruit = (Fruit) o;
    return Objects.equals(name, fruit.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}
