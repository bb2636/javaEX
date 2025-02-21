import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하세요(0~100 : ");
    int score = in.nextInt();
    String grade = "";
    if(score >= 90 && score <= 100) {
      if (score >= 96) {
        grade = "A+";
      } else {
        grade = "A0 or A-";
      }
    }else if(score >= 80 && score < 90){
      if (score >= 86){
        grade = "B+";
      } else {
        grade = "B0 or B-";
      }
    } else if(score >= 70 && score < 80){
      if (score >= 76){
        grade = "C+";
      } else {
        grade = "C0 or C-";
      }
    } else if(score >= 60 && score < 70){
      if (score >= 66){
        grade = "D+";
      } else {
        grade = "D0 or D-";
      }
    } else {
      grade = "F";
    }
    System.out.printf("입력한 점수는 %d 이며, 학점은 %s 입니다", score, grade);
  }
}
