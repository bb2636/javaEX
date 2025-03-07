package collection_framwork;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    long startTime = System.nanoTime();
    long startLils = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      al.add(0,i);
    }
    long endTime = System.nanoTime();
    long endLils = System.currentTimeMillis();
    System.out.println("배열에 마지막 원소 추가하는데 걸리는 시간 : " +
        (endTime - startTime));
    System.out.println("배열에 마지막 원소 추가하는데 걸리는 시간 : " +
        (endLils - startLils));

    startTime = System.nanoTime();
    startLils = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++) {
      ll.addFirst(i);
    }
    endTime = System.nanoTime();
    endLils = System.currentTimeMillis();
    System.out.println("배열에 마지막 원소 추가하는데 걸리는 시간 : " +
        (endTime - startTime));
    System.out.println("리스트에 마지막 원소 추가하는데 걸리는 시간 : " +
        (endLils - startLils));
  }
}
