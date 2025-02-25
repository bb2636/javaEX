import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<>();

    int score;
    while (true) {
      System.out.print("과목의 점수를 입력하세요 (-값 입력시 종료) : ");
      score = in.nextInt();
      if (score < 0) {
        break;
      } else {
        scores.add(score);
      }
    }
    System.out.println("scores : " + scores);

    int total = 0;
    double avg = 0.0;
    for (int i = 0; i < scores.size(); i++) {
      total += scores.get(i);
    }
    avg = (double) total / scores.size();

    System.out.println("scores sum : " + total);
    System.out.println("scores avg : " + avg);
  }
}
