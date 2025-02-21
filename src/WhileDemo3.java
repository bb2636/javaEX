import java.util.Scanner;

public class WhileDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("구구단 몇 단을 출력할까요 : ");
    int dan = in.nextInt();
    while(true) {
      //조건식
      if(dan < 2 || dan > 9) {
        break;
      }
      //반복문
      for (int i = 1; i < 10; i++) {
        System.out.printf("%d x %d = %4d \n", dan, i, i * dan);
      }
      //증감식
      System.out.print("구구단 몇 단을 출력할까요 : ");
      dan = in.nextInt();
    }
  }
}
