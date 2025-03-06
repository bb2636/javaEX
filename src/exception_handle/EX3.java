package exception_handle;

import java.util.*;

public class EX3 {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    int result = al.get(0) + 10; //타입체크 및 형변환 필요 없음 > 타입 안정성
    ArrayList<String> as = new ArrayList<>();
    as.add("ddd");
    System.out.println(as.get(0).length());

    Stack<Integer> si = new Stack<>();
    si.add(3);
    si.pop(); //밑이 막혀있는 공간 > 위에서 꺼냄 = pop > arraylist 처럼 몇번째를 꺼낼 수 없음
    Stack<String> ss = new Stack<>();
    ss.add("aaa");
    System.out.println(ss.pop().toLowerCase());

    Queue<Integer> qi = new LinkedList<>();
    qi.add(1);
    int num = qi.poll();
    Queue<String> qS = new LinkedList<>();

    HashMap<Integer, String> hi = new HashMap<>();
    hi.put(1,"gg");
    System.out.println(hi.get(1));

    HashMap<String , Integer> h2 = new HashMap<>();
    h2.put("apple",1);
    System.out.println(h2.get("apple"));
  }
}

