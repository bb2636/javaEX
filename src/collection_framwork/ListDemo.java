package collection_framwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"alphaka","bear","cat","deer"};
    List<String> list = Arrays.asList(animals); //aslist로 반 불변객체(추가삭제x 변경o)
    //list.add("elephant"); aslist 사용해서 원소 추가 불가능
    list.set(0,"a"); //0번째를 "a" 로 바꿈 변경 삭제 불가
    System.out.println(list);


    List<Integer> list2 = List.of(1,2,3,4,5); //of 팩토리 메소드 > 완전불변객체(추가삭제변경x)
    //list2.add(7);
    System.out.println(list2.get(1)); // get은 가능


    Collection<Integer> listc = new ArrayList<>();
    listc.add(10);
    listc.add(20);
    System.out.println(listc);
    System.out.println(listc.remove(15));

    //list는 collection을 상속받음
    List<Integer> list3 = new ArrayList<>();
    list3.add(10); //[10]
    list3.add(0,20); //[20,10] 특정 위치에 끼워넣음
    System.out.println(list3.remove(1));//해당 인덱스 번호의 원소 삭제
    //arraylist는 list를 상속받음
    ArrayList<Integer> list4 = new ArrayList<>();
  }
}
