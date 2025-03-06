package default_package;

public class ObjectDemo {
  public static void main(String[] args) {
      Keyboard k = new Keyboard("키보드");
      Keyboard k1 = new Keyboard("키보드");
      Mouse m = new Mouse("마우스");

    System.out.println(k);
    System.out.println(m);
    System.out.println(k1);
    System.out.println("k == k1"+(k == k1)); //false
    System.out.println("k == k1"+k.equals(k1)); //true
  }
}
