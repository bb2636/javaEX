package data_structure;

import java.util.Stack;

public class ListStackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("a");
    stack.push("b");
    stack.push("c"); //cba 순 출력

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    ListStack<String> ls = new ListStack<>();
    ls.push("A");
    ls.push("B");
    ls.push("C");

    System.out.println(ls.pop());
    System.out.println(ls.pop());
    System.out.println(ls.pop());
  }
}
