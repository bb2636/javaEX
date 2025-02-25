package example;
import java.util.Scanner;

public class example2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String menuItem;
    String menu = """
          -------------------------------------------------------
          1.학생수 2. 점수입력 3. 점수리스트 4. 분석(총점, 평균) 5. 종료
          -------------------------------------------------------
          """;
    int numberStudent = 0;
    int[] scores = {};
    int total = 0;
    double avg;

    label:
    while(true) {
      System.out.println(menu);
      System.out.print("입력 > ");
      menuItem = in.nextLine();
      switch (menuItem) {
        case "5":
          System.out.println("종료");
          break label;
        case "1":
          System.out.print("학생 수 입력 > ");
          numberStudent = Integer.parseInt(in.nextLine());
          break;
        case "2":
          scores = new int[numberStudent];
          for (int i = 0; i < numberStudent; i++) {
            System.out.printf("score[%d] : ", i);
            scores[i] = Integer.parseInt(in.nextLine());
          }
          break;
        case "3":
          for (int score : scores) {
            System.out.println(score);
          }
          break;
        case "4":
          for (int score : scores) {
            total += score;
          }
          avg = total / (double) numberStudent;
          System.out.println("전체 학생의 점수 합계 : " + total);
          System.out.println("전체 학생의 점수 평균 : " + avg);
          break;
        default:
          System.out.println("메뉴 번호를 확인하세요.");
          break;
      }
    }
  }
}
