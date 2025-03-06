package exception_handle;

public class EX5 {
  public static void main(String[] args) {
    Con<String, String> c1 = new Con<>();
    c1.set("홍길동","도적");
    String name1 = c1.getType();
    String job = c1.getKey();

    Con<String, Integer> c2 = new Con<>();
    c2.set("홍길동",35);
    String name2 = c2.getType();
    int age = c2.getKey();
  }
}
class Con<T, K> {
  T type;
  K key;

  public T getType() {
    return type;
  }
  public K getKey() {
    return key;
  }

  public void set(T type, K key) {
    this.type = type;
    this.key = key;
  }

}
