import java.util.Scanner;

import static java.lang.System.in;

public class ArithmeticDeMO {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;
    long result = (long) a * b;
    System.out.println(result);

    int apple = 1;
    double price = 0.1;
    int number = 7;

    double total = number * price;
    System.out.println(total);

    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력해주세요 : ");
    int x = in.nextInt();
    if(x % 2 == 0) {
      System.out.println("입력한 정수는 짝수입니다");
    }
    else {
      System.out.println("입력한 정수는 홀수입니다");
    }
  }
}
