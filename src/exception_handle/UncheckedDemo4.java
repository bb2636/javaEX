package exception_handle;

import java.util.Scanner;

public class UncheckedDemo4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자 입력: ");
    String input = in.nextLine();
    try {
      System.out.println(square(input));
    } catch (NumberFormatException e) {
      System.out.println("숫자(정수)0만 입력해주세요");
    }
  }

  private static int square(String input) throws NumberFormatException{
    int n = Integer.parseInt(input);
    return n * n;
  }
}
