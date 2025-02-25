import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] score = new int[5];
    int sum = 0;
    double avg = 0.0;

    for (int i = 0; i < score.length; i++) {
      System.out.printf("%d 번째 과목의 점수를 입력하세요 : ",i + 1 );
      score[i] = in.nextInt();
    }
    for (int i = 0; i < score.length; i++) {
      sum += score[i];

    }
    avg = (double) sum / score.length;
    System.out.println("입력한 점수 : " + Arrays.toString(score));
    System.out.println("입력한 점수들의 합 = " + sum);
    System.out.println("입력한 점수들의 평균 = " + avg);
  }
}
