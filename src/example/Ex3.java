package example;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      System.out.print("url을 입력하세요 : ");
      String url = in.nextLine();
      if (url.equalsIgnoreCase("bye")) {
        break;
      } else {
        if (url.endsWith("com")) {
          System.out.println(url + "은 \'com\' 으로 끝납니다");
        }
        if (url.startsWith("www")) {
          System.out.println(url + "은 \'www\' 으로 시작합니다");
        }
        if (url.contains("java")) {
          System.out.println(url + "은 \'java\' 를 포함합니다");
        }
      }
    }
    //s포함 여부
  }
}
