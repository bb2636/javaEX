package collection_framwork;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    if (!stack.isEmpty()) {
      System.out.println(stack.peek());
    } else {
      System.out.println("자료가 없습니다");
    }
    stack.push("10");
    stack.push("20");
    stack.push("30");

    for (String s : stack) {
      System.out.println(s);
    }
    System.out.println(stack.peek());//최상위 원소 읽기

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());//최상위 원소 반환 후 제거
    }
    System.out.println(stack.pop());//남은게 없음 > 컴파일 에러는 안남 emptystackexception
  }
}
