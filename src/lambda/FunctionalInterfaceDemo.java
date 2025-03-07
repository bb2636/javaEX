package lambda;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    list.forEach(i -> System.out.println(i + ":")); //list의 모든 요소 출력
    System.out.println("-------");
    list.removeIf(j -> j % 2 == 0); //list의 모든 요소를 읽어 짝수 삭제
    list.forEach(i -> System.out.println(i+":"));
    System.out.println("-------");
    list.replaceAll(i -> i * 10); //list의 모든 요소에 x 10
    list.forEach(i -> System.out.println(i+":"));
    System.out.println("-------");

    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "apple");
    map.put(2,"strawberry");
    map.forEach((k,v)-> System.out.println(k + "," + v));

    //static 메서드 참조
    Function<String, Integer> f = (String s) -> Integer.parseInt(s);
    f = Integer::parseInt;

    //인스턴스 메서드 참조
    BiFunction<String, String, Boolean>
        f1 = (s1, s2) -> s1.equals(s2);
    f1 = String::equals;

    //특정 객체의 인스턴스 메서드 참조
    MyClass mc = new MyClass();
    Function<String, Boolean> f2 = x -> mc.equals(x);
    f2 = mc::equals;

    //new 생성자 참조
    Supplier<MyClass> s = MyClass::new;
    Function<Integer, MyClass> f3 = MyClass::new;
  }
}

class MyClass {
  int i;
  public MyClass() {}
  public MyClass(int i) {
    this.i = i;
  }
}
