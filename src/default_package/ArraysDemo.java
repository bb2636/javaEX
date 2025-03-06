package default_package;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a','v','a'};
    char[] a2 = Arrays.copyOf(a1, 2);

    System.out.println(a1);
    System.out.println(a2);

    String[] s = {"케이크","애플","도넛","바나나"};
    System.out.println(Arrays.toString(s));
    Arrays.sort(s);
    System.out.println(Arrays.toString(s));
    System.out.println(Arrays.binarySearch(s,"애플"));
  }
}
