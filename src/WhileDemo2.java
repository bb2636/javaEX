import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int score = in.nextInt();
    String grade = "";
    while (true) {
      if (score < 0) {
        break;
      }

      if (score >= 90 && score <= 100) {
        grade = "A";
      } else if (score >= 80 && score < 90) {
        grade = "B";
      } else if (score >= 70 && score < 80) {
        grade = "C";
      } else if (score >= 60 && score < 70) {
        grade = "D";
      } else {
        grade = "F";
      }
      System.out.printf("입력한 점수는 %d 이며, 학점은 %s 입니다", score, grade);
    }
  }
}