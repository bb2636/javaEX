import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("첫번째 정수를 입력해주세요 : ");
    int x = in.nextInt();
    System.out.print("두번째 정수를 입력해주세요 : ");
    int y = in.nextInt();
    int result = x + y;
    System.out.printf("%d + %d = %d 입니다", x, y, result);
  }
}
