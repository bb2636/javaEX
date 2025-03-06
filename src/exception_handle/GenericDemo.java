package exception_handle;

import java.util.ArrayList;

public class GenericDemo {
  public static void main(String[] args) {
    ArrayList<Integer> il = new ArrayList<Integer>();
    il.add(10);
    il.add(20);
    il.add(30);
    //il.add("a");

    ArrayList<String> sl = new ArrayList<String>();
    sl.add("a");
    sl.add("b");
    sl.add("c");
    //sl.add(0);
  }
}
