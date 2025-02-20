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
    int r = x % 2;
    String s = (r == 0)? "짝수": "홀수";
    System.out.printf("입력한 수는 %d 이며 %s 입니다", x,s);
  }
}
