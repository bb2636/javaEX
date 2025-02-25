package example;

import java.util.Scanner;

public class Example1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while (true) {
      System.out.print("첫번째 숫자 입력 (-1 입력 시 종료) : ");
      int num1 = in.nextInt();
      if (num1 < 0) {
        break;
      }
      System.out.print("두번째 숫자 입력 (-1 입력 시 종료) : ");
      int num2 = in.nextInt();
      if (num2 < 0) {
        break;
      }
      //System.out.println("두 수의 합은 " + ( num1 + num2 ) + "입니다");
      int result = sum(num1, num2);
      System.out.println("두 수의 합은 " + result + "입니다");
    }

  }//end of main
 static int sum(int num1, int num2) {
   return num1 + num2;
  }
}//end of class
