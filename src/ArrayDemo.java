public class ArrayDemo {
  public static void main(String[] args) {
    int score1 = 100, score2 = 90, score3 = 80, score4 = 70, score5 = 60;
    int total = score1 + score2 + score3 + score4 + score5;
    double avg = total / (double)5;
    System.out.println("avg = " + avg);

    int[] scores = {100, 90, 80, 70, 60};
    int sum = 0;

    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    double average = (double) sum / scores.length;
    System.out.println("average = " + average);
  }
}
