package exception_handle;

public class EX1 {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(100);
    System.out.println(i.get());

    Box<String> s = new Box<>();
    s.set("만득이네");
    System.out.println(i.get());
  }
}

class Box<T> {
  private T data;

  public T get() {
    return data;
  }

  public void set(T data) {
    this.data = data;
  }
}
