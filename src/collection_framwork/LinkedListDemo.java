package collection_framwork;

import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(30);
    list.clear();
    list.addLast(10); //마지막 원소자리 찾아서 추가
    list.addLast(20);
    list.addLast(30);
    for (Integer i : list){
      System.out.println(i);
    }
    System.out.println(list.remove()); //맨 앞 원소를 삭제
    System.out.println(list.removeLast()); //마지막 원소 삭제
  }
}
