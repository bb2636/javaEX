package exception_handle;

public class EX4 {
  public static void main(String[] args) {
    Container<String> c1 = new Container<String>();
    c1.set("홍길동");
    String s = c1.get();

    Container<Integer> c2 = new Container<>();
    c2.set(6);
    int value = c2.get();
  }
}
class Container<T> {
   T type;

  public T get() {
    return type;
  }

  public void set(T type) {
    this.type = type;
  }
}