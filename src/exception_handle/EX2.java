package exception_handle;

public class EX2 {
  public static void main(String[] args) {
    Person<String, Integer> p1 = new Person<>("홍길동",32);
    System.out.println(p1.getKey()+p1.getvalue());

    Person<String, String> p2 = new Person<>("111111","KIM");
    System.out.println(p2.getKey()+p2.getvalue());

  }
}
class Person<K, V> {
  private K key;
  private V value;

  public Person(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getvalue() {
    return value;
  }
}
