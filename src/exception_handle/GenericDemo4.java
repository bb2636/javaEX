package exception_handle;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add(10);
    list.add('c');
    list.add("abc");

    int i = (Integer)list.get(2);
  }
}
