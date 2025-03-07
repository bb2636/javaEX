package collection_framwork;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String > list = Arrays.asList("다람쥐","개구리","나비");

    Iterator <String> iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
