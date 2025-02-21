import java.util.Scanner;

public class ForDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("출력할 구구단 행을 입력하세요 : ");
    int count = in.nextInt();
    for (int i = 1; i < 10; i++) {
      System.out.printf("%d x %d = %4d \n", count, i, i * count);
    }
  }
}
